try:
    width = float(input("Enter rectangle width: "))
    length = float(input("Enter rectangle length:"))

    if width == length:
        exit("NOW! THAT LOOKS LIKE A SQUARE <GET OUT>")

    area = width * length
    print(area)

except ValueError:
    print ("please enter a number.")
