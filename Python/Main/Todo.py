
while True:
    user_action = input("Type add, show, edit, complete or exit: ")
    user_action = user_action.strip()

    match user_action:
        case"add":
            todo = input("Enter a todo: ") + '\n'

            file  = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()

            todos.append(todo)

            file = open('todos.txt', 'w')
            file.writelines(todos)
            file.close()
        case 'show':
            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()

            for index, item in enumerate(todos):
                item = item.strip('\n')
                row = f"{index +1} -{item}"
                print(row)
        case 'edit':
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

        case "complete":

            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()

            number = int(input('no. of the todo to complete: '))
            todos.pop(number -1)

            with open('todos.txt', 'w') as file:
                file.writelines(todos)
                file.close()

        case 'exit':
            break

print("bey")


