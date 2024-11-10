name=input("plese enter name: ")
print("hello",name)
print(f"hello {name}") #you can also write like this
date=input("enter a date: ")
letter = '''
Dear <|Name|>,
You are selected!
<|Date|>
'''
letter = letter.replace("<|Name|>", name).replace("<|Date|>", date)

print(letter)

