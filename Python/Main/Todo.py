
while True:
    user_action = input('Type add show, edit, exit or complete todo:')
    user_action = user_action.strip()


    if 'add' in user_action:
        todo = user_action[4:]



        with open('todos.txt', 'r') as file:
            todos = file.readlines()

        todos.append(todo)


        with open('todos.txt', 'w')as file:
            file.writelines(todos)
    if 'show' in user_action:
        file = open('todos.txt', 'r')
        todos = file.readlines()
        file.close()



        for index, item in enumerate(todos):
            item = item.strip('\n')
            item = item.title()
            row = f"{index  + 1}- {item}"
            print(row)
    if 'edit' in user_action:
         number = int (input ('Number of the todo to edit: ') )
         number = number - 1

         with open('todos.txt', 'r') as file:
             todos = file.readlines()

         new_todo = input('Enter new todo: ')
         todos[number] = new_todo + '\n'

         with open('todos.txt', 'w') as file:
             file.writelines(todos)

    if 'complete' in user_action:
         number = int(input('Number of the todo to complete: '))
         with open('todos.txt', 'r') as file:
             todos = file.readlines()
         index = number-1
         todo_to_remove = todos[index].strip('\n')
         todos.pop(index)

         with open('todos.txt', 'w') as file:
             file.writelines(todos)

         message = f"The todo {todo_to_remove} was removed form the list"
         print(message)

    if 'exit' in user_action:
        break



print('BEY!')



