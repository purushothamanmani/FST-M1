user1 = (input("Player name1 is: "))
user2 = (input("Player name2 is: "))

while True:
    user1_ans = input(user1 + ", Do you want to choose Rock, Paper or Scissors?: ").lower()
    user2_ans = input(user2 + ", Do you want to choose Rock, Paper or Scissors?: ").lower()
    if user1_ans == user2_ans:
        print("Game is tie")
    elif user1_ans == "rock":
        if user2_ans == "scissors":
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1_ans == "scissors":
        if user2_ans == "paper":
            print("Scissors wins!")
        else:
            print("Rock wins!")
    elif user1_ans == "paper":
        if user2_ans == "rock":
            print("Paper wins!")
        else:
            print("Scissors wins!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    repeat_game = input("Do you want to play another round? Yes/No: ").lower()
    if repeat_game == "yes":
        pass
    elif repeat_game == "no":
        raise SystemExit
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit
