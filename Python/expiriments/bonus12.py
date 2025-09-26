feet_inches = input("Enter feet and inches: ")

def covert(feet_inches):
    parts = feet_inches.split(" ")
    feet = float(parts[0])
    inches = float(parts[1])

    meters = feet * 0.3048 + inches * 0.0254
    return meters


result = covert(feet_inches)

if result < 1:
    print("kid is too small")
else:
    print("Kid can use the slide")