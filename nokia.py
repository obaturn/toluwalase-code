def mainMenu():
	print("""
		1 : phonebook
		2 : messages
		3 : chat
		4 : call register
		5 : tones
		6 : settings
		7 : call divert
		8 : games
		9 : calculator
		10 : reminders
		11 : clock
		12 : profiles
		13 : sim service
		""")
	menu = int(input('enter any options: '))
	match(menu):
		case 1 : phonebook()
		case 2 : messages ()
		case 3 : chat ()
		case 4 : callregister ()
		case 5 : tones()
		case 6 : settings ()
		case 7 : calldivert ()
		case 8 : games ()
		case 9 : calculator ()
		case 10 : reminders()
		case 11 : clock()
		case 12 : profiles()
		case 13 : simservice()
     

def phonebook():
	print("""
	1 : search
	2 : service nos
	3 : add name 
	4 : erase
	5 : edit
	6 : assign tone
	7 : send b card
	8 : options
	9 : speed dials
	10 : voice tags
		""")
        
	tolu = int(input('enter any options in phonebook'))
	match(tolu):
		case 1 : print("search")
		case 2 : print("service nos")
		case 3 : print("add name")
		case 4 : print("erase")
		case 5 : print("edit")
		case 6 : print("assign tone")
		case 7 : print("send b card")
		case 8 : options()
		case 9 : print("speed dials")
		case 10 : print("voice tags")
	
def options():
	print("""
	1 : type of view 
	2 : memory status
		""");
	tolu_1 = int(input('select any options in phonebook'))
	match(tolu_1):
		case 1 : print("type of view");
		case 2 : print("memory status");
def messages ():
	print("""
	1 : write messages
	2 : inbox
	3 : outbox 
	4 : picture messages
	5 : templates
	6 : smileys
	7 : message settings 
	8 : info service
	9 : voice mailbox number
	10 : service command editor
		""")
	tolu_2 = int(input("kindly select out of the above options"))
	match(tolu_2):
		case 1 : print("write messages") 
		case 2 : print("inbox")
		case 3 : print("outbox")
		case 4 : print("picture messages")
		case 5 : print("template") 
		case 6 : print("smileys") 
		case 7 : messagesettings() 
		case 8 : print("info service") 
		case 9 : print("voice mailbox number") 
		case 10 : print("service command editor") 
def messagesettings():
	print("""
	1 : set1
	2 : common3
		""")

	tolu_3 = int(input("select any of the above requirement"))
	match(tolu_3):
		case 1 : set1()
		case 2 : common3()
def set1():
	print("""
	1 : message centre number
	2 : message sent as
	3 : message validity
		""")

	tolu_4 = int(input("click on any options"))
	match(tolu_4):
		case 1 : print("message centre number")
		case 2 : print("message sent as")
		case 3 : print("message validity")

def common3():
	print("""
	1 : delivery reports
	2 : reply via same centre 
	3 : character support
		""")
	tolu_5 = int(input('click on any selected above'))
	match(tolu_5):
		case 1 : print("delivery reports")
		case 2 : print("reply via same centre")
		case 3 : print("charcter support")

def chat ():
	print("""
	1 : welcome to chat
	2 : let interact
	3 : show love to each oter
		""")
	tolu_6 = int(input("select any options"))
	match(tolu_6):
		case 1 : print("welcome to chat");
		case 2 : print("let interact");
		case 3 : print("show love to each other")

def callregister ():
	print("""
	1 : missed call
	2 : received call
	3 : dialled numbers
	4 : erase recent calls lists
	5 : show call duration
	6 : show call costs
	7 : call cost settings
	8 : prepaid credit
		""")
	tolu_7 = int(input("kidly select any options from the above"))
	match(tolu_7):
		case 1 : print("missed calls")
		case 2 : print("received calls")
		case 3 : print("dialled numbers")
		case 4 : print("erase recent calls lists")
		case 5 : showcallduration ()
		case 6 : showcallscost ()
		case 7 : callcostsettings ()
		case 8 : System.out.println("prepaid credit")
def showcallduration ():
	print("""
	1 : last call duration
	2 : all calls duration
	3 : received call duration
	4 : dialled calls duration
	5 : clear timers
		""")
	tolu_8 = int(input("enter any options of the selected above"))
	match(tolu8):
		case 1 : print("last call duration")
		case 2 : print("all calls duration")
		case 3 : print("received call duration")
		case 4 : print("dialled calls duration")
		case 5 : print("clear timers")

def showcallscost ():
	print("""
	1 : last call cost
	2 : all calls cost
	3 : clear counters
		""");
	tolu_9 = int(input('enter any options of your choice'))
	match(tolu_9):
		case 1 : print("last call cost");
		case 2 : print("all call cost");
		case 3 : print("clear counters");

def callcostsettings ():
	print("""
	1 : call cost limit
	2 : show cost in
		""");
	tolu_10 = int(input("enter any selection of your choice"))
	match(tolu10):
		case 1 : print("call cost limit")
		case 2 : print("show cost in")
def tones():
	
	print("""
	1 : ringing tone
	2 : ringing volume
	3 : incoming call alert
	4 : composer
	5 : message alert tone
	6 : keypad tones
	7 : warming and gaming tones
	8 : vibrating alert
	9 : screen saver
		""")
	tolu_11 = int(input("enter any of the options below"))
	match(tolu_11):
		case 1 : print("ringing tone")
		case 2 : print("ringing volume")
		case 3 : print("incoming call alert")
		case 4 : print("composer")
		case 5 : print("message alert tone")
		case 6 : print("keypad tones")
		case 7 : print("warming and gaming tones")
		case 8 : print("vibrating alert")
		case 9 : print("screen saver")
def settings ():
	print("""
	1 : call settings
	2 : phone settings
	3 : security setiings
	4 : restore factory settings
		""")
	tolu_12 = int(input("enter any number of your choice"))
	match(tolu_12):
		case 1 : callsettings ();
		case 2 : phonesettings ();
		case 3 : securitysettings ();
		case 4 : print("restore factory settings")
def callsettings ():
	print("""
	1 : automatic redial
	2 : speed dials
	3 : call waiting options
	4 : own number sending
	5 : phone line in use
	6 : automatic answer
		""")
	tolu_13 = int(input("enter any selcted options from the above"))
	match(tolu_13):
		case 1 : print("automatic redial")
		case 2 : print("speed dials")
		case 3 : print("call waiting options")
		case 4 : print("own number sending")
		case 5 : print("phone line in use")
		case 6 : print("automatic answer")

def phonesettings ():
	print("""
	1 : language
	2 : cell info display
	3 : welcome note
	4 : network selection
	5 : lights
	6 : confirm sim service actions
		""")
	tolu_14 = int(input("enter any options"))
	match(tolu_14):
		case 1 : print("language")
		case 2 : print("cell info display")
		case 3 : print("welcome note")
		case 4 : print("network selection")
		case 5 : print("lights")
		case 6 : print("confirm sim service")

def securitysettings ():
	print("""
	1 : pin code request
	2 : call barring service
	3 : fixed dialling
	4 : closed user group
	5 : phone security
	6 : change access codes
		 """)
	
	tolu_15 = int(input("enter any of the selected options"))
	match(tolu_15):
		case 1 : print("pin code request")
		case 2 : print("call barring service")
		case 3 : print("fixed dialling")
		case 4 : print("closed user group")
		case 5 : print("phone security settings")
		case 6 : print("change access codes")
def calldivert ():
	print("""
	1 : welcome to call divert
	2 : laid down your complain	
	3 : having network  issue
		""")
	tolu_16 = int(input("enter any options"))
	match(tolu_16):
		case 1 : print("welcome to call divert")
		case 2 : print("laid down your complain")
		case 3 : print(" having network issue")

def games ():
	print("""
	1 : temple run play
	2 : dream league
	3 : car drive
		""")
	tolu_17 = int(input('enter any options'))
	match(tolu_17):
		case 1 : print("temple run play");
		case 2 : print("dream league");
		case 3 : print("car drive");

def calculator ():
	print("""
	1 : division
	2 : multiplication
	3 : subtraction
	4 : addition
		""")
	tolu_18 = int (input('enter any options'))
	match(tolu_18):
		case 1 : print("divison");
		case 2 : print("multiplication");
		case 3 : print("subtraction");
		case 4 : print("addition");

def reminders():
	print("""
	1 : welcome to reminders
	2 : what do we offer you
		""")
	tolu_19 = int(input("enter any options"))
	match(tolu19):
		case 1 : print("welcome to reminders");
		case 2 : print("what do we offer you");

def clock():
	print("""
	1 : alarm clock
	2 : clock settings
	3 : date settings
	4 : stop watch
	5 : count down timer
	6 : auto update of date and time
		""")
	tolu_20 = int(input("enter any options"))
	match(tolu_20):
		case 1 : print("alarm clock");
		case 2 : print("clock settings");
		case 3 : print("date settings");
		case 4 : print("stop watch");
		case 5 : print("count down timer");
		case 6 : print("auto update of date and time");

def profiles (): 
	print("""
	1 : welcome to profiles
	2 : ringing volume
	3 : set reminder
	4 : change background colour
	5 : having media issue
		""")
	tolu_21 = int(input("enter selected options"))
	match(tolu_21):
		case 1 : print("welcome to profiles");
		case 2 : print("ringing volume");
		case 3 : print("set reminder");
		case 4 : print("change background colour");
		case 5 : print("having media issue");

def simservice ():
	print("""
	1 : sub data
	2 : borrow card
	3 : do subcription
	4 : share data
	5 : laid down complain
	6 : register new account
		""")
	tolu_22 = int(input("enter any of the selected options and exist"))
	match(tolu_22):
		case 1 : print("sub data");
		case 2 : print("borrow card");
		case 3 : print("do subcription");
		case 4 : print("share data");
		case 5 : print("laid down complain");
		case 6 : print("register new account");



mainMenu()






