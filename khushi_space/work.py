# inheritance
class food:
    def delicious(self):
        print("I am very delicious")
class yummy(food):
    def pizza(self):
        print("I am cheesy")

class sweet(food):
    def choclate(self):
        print("I am very sweet")

f1=yummy()
s1=sweet()

f1. pizza() 
f1. delicious()
s1.choclate()



# polymorphism

class car:
    def sound(self):
        print("car start ") 

class bus:
    def sound(self):
        print("bus stop")

c1 = car()
b1 = bus() 

c1.sound()
b1.sound()  

