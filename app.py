# for i in range(4):
#     print("Hello")

# n = 5

# intagram = ["feed 1", "feed 2", "feed 3"]

# for i in range():
#     print(i)

# n = 5

# for i in range(n):
#     for j in range(n):
#         print(i , j)

# for i in range(2):
#     for j in range(4):
#         print(i, j)

bookshell = ["Book 1", "Book 2 ", "Book 3"]
# (object: str)
bookshell.append("Book 4")
# (Index, object: str)
bookshell.insert(1, "History Book")
# (Iteretes: [str])
bookshell.extend(["Physics", "English", "Hindi"])



# Update 
bookshell[0] = "Nature Book"
bookshell[2] = "Fruits Book"
bookshell[3] = "Maths Book"
bookshell[4] = "SST Book"

# Remove
# value: str
bookshell.remove("Physics")

print(bookshell)

# Array 
# Operation - Add, Update, Remove
# User = Show me all books
# Array = Show Book
# User Option = Remove Books
# Input = Enter Book Name
# Check = Book existance
# If Yes = Book is deleted 
# Show = Latest Array 
# If no = There are no book is find with this name.
# Show = Avaiable Book array