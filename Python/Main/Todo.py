
while True:
    user_action = input("Type add, show, edit, complete or exit: ")
    user_action = user_action.strip()


    if user_action.startswith("add"):
        todo = user_action[4:]

        file  = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()

        todos.append(todo + '\n')

        file = open('todos.txt', 'w')
        file.writelines(todos)
        file.close()

        user_action = user_action + '\n'

    elif user_action.startswith("show"):
        file = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()

        for index, item in enumerate(todos):
            item = item.strip('\n')
            row = f"{index +1} -{item}"
            print(row)

    elif user_action.startswith("edit"):
        try:
            number = int(user_action[5:])
            print(number)

            number = number - 1

            with open('todos.txt', 'r') as file:
                todos = file.readlines()

            new_todo = input ("Enter new todo: ")
            todos[number] = new_todo + '\n'

            with open('todos.txt','w')as file:
                file.writelines(todos)
        except ValueError:
            print("Your command is not valid")
            continue

    elif user_action.startswith("complete"):
        try:
            number = int(user_action[9:])

            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()
            todos.pop(number - 1)

            with open('todos.txt', 'w') as file:
                file.writelines(todos)
                file.close()
        except IndexError:
            print("Out of the range")
            continue

    elif user_action.startswith("exit"):
        break

    else:
        print('command is not valid')

print("bey")


