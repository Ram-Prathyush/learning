
while True:
    user_action = input('Type add show, edit, exit or complete todo todo:')
    user_action = user_action.strip()

    match user_action:
        case'add':
            todo = input('Enter a todo:') + "\n"

            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()

            todos.append(todo)

            file = open('todos.txt', 'w')
            file.writelines(todos)
            file.close()
        case'show' | 'display':
            file = open('todos.txt', 'r')
            todos = file.readlines()
            file.close()
            for index, item in enumerate(todos):
                item = item.title()
                row = f"{index  + 1}- {item}"
                print(row)
        case ('edit'):
             number = int (input ('Number of the todo to edit: ') )
             number = number - 1
             new_todo = input('Enter new todo: ')
             todos[number] = new_todo
        case 'complete':
             number = int(input('Number of the todo to complete: '))
             todos.pop(number)
        case 'exit':
            break



print('BEY!')



