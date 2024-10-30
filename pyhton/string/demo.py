# Original string
text = "   Hello World! Welcome to the world of Python. Python is fun!   "

# 1. Lowercase and Uppercase
print("Lowercase:", text.lower())               # All lowercase
print("Uppercase:", text.upper())               # All uppercase

# 2. Strip
stripped_text = text.strip()
print("Stripped:", stripped_text)               # Removes leading and trailing whitespace

# 3. Replace
replaced_text = stripped_text.replace("Python", "Coding")
print("Replace 'Python' with 'Coding':", replaced_text)

# 4. Split
split_text = stripped_text.split(" ")
print("Split by spaces:", split_text)

# 5. Join
joined_text = "-".join(split_text)
print("Join with hyphens:", joined_text)

# 6. Find
first_occurrence = stripped_text.find("World")
print("First occurrence of 'World':", first_occurrence)

# 7. Startswith and Endswith
print("Starts with 'Hello':", stripped_text.startswith("Hello"))
print("Ends with 'fun!':", stripped_text.endswith("fun!"))

# 8. Isdigit
numeric_text = "12345"
print("Is '12345' all digits?:", numeric_text.isdigit())
print("Is 'Hello' all digits?:", stripped_text.isdigit())

# 9. Count
count_world = stripped_text.count("world")
print("Count of 'world':", count_world)

# 10. Format
formatted_text = "Hello, {}! Welcome to {}.".format("Alice", "Python")
print("Formatted text:", formatted_text)
