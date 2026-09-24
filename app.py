# # for i in range(4):
# #     print("Hello")

# # n = 5

# # intagram = ["feed 1", "feed 2", "feed 3"]

# # for i in range():
# #     print(i)

# # n = 5

# # for i in range(n):
# #     for j in range(n):
# #         print(i , j)

# # for i in range(2):
# #     for j in range(4):
# #         print(i, j)

# bookshell = ["Book 1", "Book 2 ", "Book 3"]
# # (object: str)
# bookshell.append("Book 4")
# # (Index, object: str)
# bookshell.insert(1, "History Book")
# # (Iteretes: [str])
# bookshell.extend(["Physics", "English", "Hindi"])


# # Update 
# bookshell[0] = "Nature Book"
# bookshell[2] = "Fruits Book"
# bookshell[3] = "Maths Book"
# bookshell[4] = "SST Book"

# # Remove
# # value: str
# bookshell.remove("Physics")

# print(bookshell)

# # Array 
# # Operation - Add, Update, Remove
# # User = Show me all books
# # Array = Show Book
# # User Option = Remove Books
# # Input = Enter Book Name
# # Check = Book existance
# # If Yes = Book is deleted 
# # Show = Latest Array 
# # If no = There are no book is find with this name.
# # Show = Avaiable Book array


# We can use a parent class or fucnnction method, attributes and properties in children classes for reusblities.

# Parent
# class Animal:
#     def eating(self):
#         print("Animal is eating...")

# # Child
# class Dog(Animal):
#     def bark(self):
#         print("Animal is Barking")

# class Cat(Animal):
#     def meow(self):
#         print("Animal is Meow")

# # Child Execuation
# dog = Dog()
# cat = Cat()

# # Comes from Parent Class;
# dog.eating()
# dog.bark()

# cat.eating()
# cat.meow()


# class Person:
#     # Create / Fetch / Set
#     def __init__(self, name):  
#         self.name = name

#     # Print / Get
#     def show_name(self):
#         print(self.name)

# class Student(Person):
#     def study(self):
#         print(self.name, "is Studying...")

# class Employee(Person):
#     def position(self):
#         print(self.name, "is a Developer")

# std1 = Student("Ayushman")
# # std1.show_name()
# std1.study()
# std2 = Student("Khushi")
# # std1.show_name()
# std2.study()

# emp = Employee("Rahul")
# # Parent Method
# emp.show_name()
# # it's own method
# emp.position()


# Polymorphism - We can create an same method in multiple classes and assign task, and method will be worked with assign task without making conflicts.
# Same method ko alag alag class me passs krne ke bad alag alag task assign kiya jata hai, or code run krne ke time par class ke according same method work krti hai bina kisi confliction ke.
# Rahul (Brain)=
# class Math, Class English, Class Hindi
# ---Math---------English-------Hindi----
# __(Brain)________(Brain)_______(Brain)___

# Class 1
# class Dog:
#     # Sounds Method
#     def sounds(self):
#         # Behaviour
#         print("Dog makes sounds")

# # Class 2
# class Cat:
#     # Sounds Method
#     def sounds(self):
#         # Behaviour
#         print("Cat make sounds")


# d1 = Dog()
# c1 = Cat()
# # Comes from Dog Side
# d1.sounds()
# # Comes from Cat Side
# c1.sounds()

# obj = [
#     {
#         name: "ayushman",
#         age: 25,
#     },
#     {
#         name: "Khushi",
#         age: 25,
#     }, {
#         name: "Rahul",
#         age: 25,
#     }, {
#         name: "Mohan",
#         age: 25,
#     }
# ]

# print(obj[2].name)


class Animal:
    def sounds(self):
        print("Animal Can makes a sounds")

class Dog(Animal):
    def sounds(self):
        print("Dog can Barks")

class Cat(Animal):
    def sounds(self):
        print("Cat can meow")

class Bird(Animal):
    def sounds(self):
        print("Bird can Peeepeee")

# anim = Animal()
# dog = Dog()
# cat = Cat()

# anim.sounds()
# dog.sounds()
# cat.sounds()

allBehave = [Dog(), Cat(), Bird()]

for behav in allBehave:
    behav.sounds()

