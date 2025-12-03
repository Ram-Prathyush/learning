
while True:
    user_action = input("Type add, show, edit, complete or exit: ")
    user_action = user_action.strip()


    if "add" in user_action:
        todo = user_action[4:]

        file  = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()

        todos.append(todo)

        file = open('todos.txt', 'w')
        file.writelines(todos)
        file.close()

        user_action = user_action + '\n'

    elif 'show' in user_action:
        file = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()

        for index, item in enumerate(todos):
            item = item.strip('\n')
            row = f"{index +1} -{item}"
            print(row)

    elif 'edit' in user_action:
        number = int(input('no. of the todo to edit: '))
        number = number - 1

        file = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()

        new_todo = input("Enter new todo: ")
        todos[number] = new_todo + '\n'

        with open('todos.txt', 'w') as file:
            file.writelines(todos)
            file.close()

    elif "complete" in user_action:
        number = int(user_action[9:])

        file = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()
        todos.pop(number - 1)

        with open('todos.txt', 'w') as file:
            file.writelines(todos)
            file.close()

    elif 'exit' in user_action:
        break

    else:
        print('command is not valid')

print("bey")


