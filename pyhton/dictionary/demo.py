a={
    "marks":99,
    "name":"jainil",
    "age":12,
    0:"avx"#you can also write like this
}
print(a.items())#Returns a list of (key,value)tuples.
a.update({"age":19})
print(a.keys())
print(a.values())
print(a.get(0))
print(a[0])#is not same as get method

# Example dictionary
my_dict = {"a": 1, "b": 2, "c": 3}
print("Original dictionary:", my_dict)

# 1. clear(): Removes all items from the dictionary
my_dict.clear()
print("After clear():", my_dict)  # Output: {}

# Reset dictionary for further examples
my_dict = {"a": 1, "b": 2, "c": 3}

# 2. copy(): Returns a shallow copy of the dictionary
new_dict = my_dict.copy()
print("After copy():", new_dict)  # Output: {'a': 1, 'b': 2, 'c': 3}

# 3. fromkeys(seq, value): Creates a new dictionary with keys from seq, values set to value
new_dict = dict.fromkeys(['x', 'y', 'z'], 0)
print("After fromkeys(['x', 'y', 'z'], 0):", new_dict)  # Output: {'x': 0, 'y': 0, 'z': 0}

# 4. get(key, default): Returns the value for key if key exists, else returns default
value = my_dict.get("a", 0)
print("After get('a', 0):", value)  # Output: 1

# 5. items(): Returns a view object with dictionary’s (key, value) pairs
items = my_dict.items()
print("After items():", items)  # Output: dict_items([('a', 1), ('b', 2), ('c', 3)])

# 6. keys(): Returns a view object with dictionary keys
keys = my_dict.keys()
print("After keys():", keys)  # Output: dict_keys(['a', 'b', 'c'])

# 7. values(): Returns a view object with dictionary values
values = my_dict.values()
print("After values():", values)  # Output: dict_values([1, 2, 3])

# 8. pop(key, default): Removes the key and returns its value; if key doesn’t exist, returns default
value = my_dict.pop("a", "default")
print("After pop('a', 'default'):", value)  # Output: 1
print("Dictionary after pop:", my_dict)  # Output: {'b': 2, 'c': 3}

# 9. popitem(): Removes and returns the last (key, value) pair
item = my_dict.popitem()
print("After popitem():", item)  # Output: ('c', 3)
print("Dictionary after popitem:", my_dict)  # Output: {'b': 2}

# Reset dictionary for further examples
my_dict = {"a": 1, "b": 2, "c": 3}

# 10. setdefault(key, default): Returns value if key exists; if not, inserts key with default value
value = my_dict.setdefault("d", 4)
print("After setdefault('d', 4):", value)  # Output: 4
print("Dictionary after setdefault:", my_dict)  # Output: {'a': 1, 'b': 2, 'c': 3, 'd': 4}

# 11. update([other]): Updates dictionary with items from other dictionary or key-value pairs
my_dict.update({"e": 5, "f": 6})
print("After update({'e': 5, 'f': 6}):", my_dict)  # Output: {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6}
