try:
    width = float(input("Enter rectangle width: "))
    length = float(input("Enter rectangle length: "))

    if width == length:
        exit("that looks like  a square")

    area = width * length
    print(area)
except ValueError:
    print("Please enter a number")
