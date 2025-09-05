filenames = ["1.doc", "1.report", "1,presentation"]

filenames  = [filename.replace('.', '_' + 'txt' for filename in filenames)]