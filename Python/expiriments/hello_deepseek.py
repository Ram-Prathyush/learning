from transformers import AutoTokenizer, AutoModelForCausalLM
import torch

model_id = "deepseek-ai/DeepSeek-R1-Distill-Qwen-7B"

print("Loading model...")
tokenizer = AutoTokenizer.from_pretrained(model_id, trust_remote_code=True)
model = AutoModelForCausalLM.from_pretrained(
    model_id,
    torch_dtype=torch.float16 if torch.cuda.is_available() else torch.float32,
    device_map="auto",
    trust_remote_code=True
)

prompt = "Hello, world!"
inputs = tokenizer(prompt, return_tensors="pt").to(model.device)
outputs = model.generate(**inputs, max_new_tokens=50)
result = tokenizer.decode(outputs[0], skip_special_tokens=True)

print("\nDeepSeek output:")
print(result)
