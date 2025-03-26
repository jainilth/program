class person:
    def __init__(self,fname,lname):
        self.firstname = fname
        self.lastname = lname
    def displayPerson(self):
        print("First Name: ",self.firstname)
        print("Last Name: ",self.lastname)
class student(person):
    def __init__(self,fname,lname,rollno):
        person.__init__(self,fname,lname)
        self.rollno = rollno
    def displayStudent(self):
        print("First Name: ",self.firstname)
        print("Last Name: ",self.lastname)
        print("Roll No: ",self.rollno)
        
ob=student("Raj","Kumar",101)
ob.displayStudent()
ob.displayPerson()
