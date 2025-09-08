
while True:
    user_action = input('Type add show, edit, exit or complete todo:')
    user_action = user_action.strip()

    match user_action:
        case'add':
            todo = input('Enter a todo:') + "\n"



            with open('todos.txt', 'r') as file:
                todos = file.readlines()

            todos.append(todo)


            with open('todos.txt', 'w')as file:
                file.writelines(todos)
        case'show' | 'display':
            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()

            #new todos = [item.strip('\n') for item in todos]
            #The method i did above is list comprenhition

            for index, item in enumerate(todos):
                item = item.strip('\n')
                item = item.title()
                row = f"{index  + 1}- {item}"
                print(row)
        case ('edit'):
             number = int (input ('Number of the todo to edit: ') )
             number = number - 1

             with open('todos.txt', 'r') as file:
                 todos = file.readlines()

             new_todo = input('Enter new todo: ')
             todos[number] = new_todo + '\n'

             with open('todos.txt', 'w') as file:
                 file.writelines(todos)
        case 'complete':
             number = int(input('Number of the todo to complete: '))
             with open('todos.txt', 'r') as file:
                 todos = file.readlines()
             index = number-1
             todo_to_remove = todos[index]
             todos.pop(index)

             with open('todos.txt', 'w') as file:
                 file.writelines(todos)

             message = f"The todo {todo_to_remove} was removed form the list"
             print(message)

        case 'exit':
            break



print('BEY!')



