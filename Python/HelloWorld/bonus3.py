filenames = ['1.Taw Data.txt', '2.Reports.txt', 'Presentation.txt']

for filename in filenames:
    filename = filename.replace('.', '-', 1)
    print(filename)