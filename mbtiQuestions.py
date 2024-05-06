def separate_result(result):
    extroverted_introvert = []
    sensing_intuitive = []
    thinking_feeling = []
    judging_perspective = []
    
    for i in range(0, len(result), 4):
        extroverted_introvert.append(result[i])
    
    for i in range(1, len(result), 4):
        sensing_intuitive.append(result[i])
    
    for i in range(2, len(result), 4):
        thinking_feeling.append(result[i])
    
    for i in range(3, len(result), 4):
        judging_perspective.append(result[i])
    
    print("Extroverted/Introverted:", extroverted_introvert)
    print("Sensing/Intuitive:", sensing_intuitive)
    print("Thinking/Feeling:", thinking_feeling)
    print("Judging/Perspective:", judging_perspective)


if __name__ == "__main__":
    words = [
        ["A.expend energy, enjoy groups", "B.Conserve energy, enjoy one_on_one"],
        ["A.Interpret, literally", "B. look for meaning and possibilities"],
        ["A.Logical thinking, questioning", "B.empathetic, feeling, accommodating"],
        ["A.Organized, orderly", "B.flexible, adaptable"],
        ["A.More outgoing, think out loud", "B.more reserved, think to yourself"],
        ["A.practical realistic, experimental", "B.imaginative, innovative, theoretical"],
        ["A.candid, straight forward, frank", "B.tactful, kind, encouraging"],
        ["A.plan schedule", "B.unplan, schedule"],
        ["A.Seek many tasks, public activities, interactive with others", "B.seek private, solitary activities with quiet to concentrate"],
        ["A.Standard, usual, conventional, hold the line", "B.different, novel, unique"],
        ["A.Firm, tend to criticize, hold the line", "B.gentle tend to appreciate conciliate"],
        ["A.regulated structured", "B.easy going live and let live"],
        ["A.external, communicative, express yourself", "B.internal reticent, keep to yourself"],
        ["A.focus on here and now", "B.look to the future, global perspective, big picture"],
        ["A.tough minded just", "B.tender-hearted merciful"],
        ["A.preparation, plan ahead", "B.go with the flow adapt as you go"],
        ["A.active, initiate", "B.reflective deliberate"],
        ["A.facts things what is issue-oriented", "B.ideas dreams what could be philosophical"],
        ["A.matter of fact, issue-oriented", "B.sensitive people, oriented compassionate"],
        ["A.control, govern", "B.latitude, freedom"],
    ]

    result = []
    for i in range(0, len(words), 2):
        for j in range(len(words[i])):
            print(words[i][j], words[i + 1][j])
            user_input = input("Enter either options A or B: ")
            while user_input.lower() not in ["a", "b"]:
                print("Error: Please enter either 'A' or 'B'.")
                user_input = input("Enter either options A or B: ")
            result.append(user_input.upper() + " " + words[i][j])

    separate_result(result)
