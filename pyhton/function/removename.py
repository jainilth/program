def rem(l,word):
    n=[]
    for i in l:
        if not (i==word):
            n.append(i.strip(word))
    return n


l=["jainill", "het","rohan","an"]

print(rem(l,"an"))