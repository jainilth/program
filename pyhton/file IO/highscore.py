import random
def game():
    print("Welcome to the game!")
    score=random.randint(1,100)
    with open("D://jainil//program//pyhton//file IO//highscore.txt") as f:
        highscore=f.read()
        if highscore!="":
            highscore=int(highscore)
        else:
            highscore=0
            
    print(f"your score is {score}")
    if(score>highscore):
        with open("D://jainil//program//pyhton//file IO//highscore.txt","w") as f:
            f.write(str(score))
            
    return score

game()