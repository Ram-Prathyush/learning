contents = ['All carrots are to be sliced longitudinally.' 'The carrots were reportedly sliced']
filenames = ['doc.txt', 'reports.txt', 'presentation']

for content, filename in zip(contents, filenames):
    file =open(f"../test/{filename}", 'w')
    file.write(content)