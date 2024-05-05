import java.util.Scanner;


public class Nokia3310Plus{
static Scanner obaturn = new Scanner(System.in);


public static void MainMenu() {
System.out.print("""
1 -> phonebook
2 -> messages
3 -> chat
4 -> call register
5 -> tones
6 -> settings
7 -> call divert
8 -> games
9 -> calculator
10 -> reminders
11 -> clock
12 -> profiles
13 -> sim service
	""");

int Menu = obaturn.nextInt();
switch(Menu) {
case 1 -> phonebook();
case 2 -> messages ();
case 3 -> chat ();
case 4 -> callregister ();
case 5 -> tones();
case 6 -> settings ();
case 7 -> calldivert ();
case 8 -> games ();
case 9 -> calculator ();
case 10 -> reminders();
case 11 -> clock();
case 12 -> profiles();
case 13 -> simservice();
default -> System.out.println("sorry sir choose another thing");
}
}

public static void phonebook() {
System.out.print("""
1 -> search
2 -> service nos
3 -> add name 
4 -> erase
5 -> edit
6 -> assign tone
7 -> send b card
8 -> options
9 -> speed dials
10 -> voice tags
	""");

int tolu = obaturn.nextInt();
switch(tolu) {
case 1 -> System.out.println("search");
case 2 -> System.out.println("service nos");
case 3 -> System.out.println("add name");
case 4 -> System.out.println("erase");
case 5 -> System.out.println("edit");
case 6 -> System.out.println("assign tone");
case 7 -> System.out.println("send b card");
case 8 -> options();
case 9 -> System.out.println("speed dials");
case 10 -> System.out.println("voice tags");
default -> System.out.println("sorry this is not part of our main service");
}
}

public static void options() {
System.out.print("""
1 -> type of view 
2 -> memory status
	""");
int tolu1 = obaturn.nextInt();
switch(tolu1){
case 1 -> System.out.println("type of view");
case 2 -> System.out.println("memory status");
default -> System.out.println("pls kindly go back to the main menu");
}
}

public static void messages () {
System.out.print("""
1 -> write messages
2 -> inbox
3 -> outbox 
4 -> picture messages
5 -> templates
6 -> smileys
7 -> message settings 
8 -> info service
9 -> voice mailbox number
10 -> service command editor
		""");
int tolu2 = obaturn.nextInt();
switch(tolu2) {
case 1 -> System.out.println("write messages"); 
case 2 -> System.out.println("inbox"); 
case 3 -> System.out.println("outbox"); 
case 4 -> System.out.println("picture messages"); 
case 5 -> System.out.println("template"); 
case 6 -> System.out.println("smileys"); 
case 7 -> messagesettings(); 
case 8 -> System.out.println("info service"); 
case 9 -> System.out.println("voice mailbox number"); 
case 10 -> System.out.println("service command editor");
default -> System.out.println(" sorry this is not part of our main service"); 
}
}
public static void messagesettings() {
System.out.print("""
1 -> set1
2 -> common3
		""");

int tolu3 = obaturn.nextInt();
switch(tolu3) {
case 1 -> set1();
case 2 -> common3();
}
}
public static void set1() {
System.out.print("""
1 -> message centre number
2 -> message sent as
3 -> message validity
	""");

int tolu4 = obaturn.nextInt();
switch(tolu4) {
case 1 -> System.out.println("message centre number");
case 2 -> System.out.println("message sent as");
case 3 -> System.out.println("message validity");
default -> System.out.println("kindly pls go to back");
}
}
public static void common3() {
System.out.print("""
1 -> delivery reports
2 -> reply via same centre 
3 -> character support
	""");
int tolu5 = obaturn.nextInt();
switch(tolu5){
case 1 -> System.out.println("delivery reports");
case 2 -> System.out.println("reply via same centre");
case 3 -> System.out.println("charcter support");
default -> System.out.println("this is not part of our main service");
}
}
public static void chat (){
System.out.print("""
1 -> welcome to chat
2 -> let interact
3 -> show love to each oter
	""");
int tolu6 = obaturn.nextInt();
switch(tolu6){
case 1 -> System.out.println("welcome to chat");
case 2 -> System.out.println("let interact");
case 3 -> System.out.println("show love to each other");
default -> System.out.println("this is not part of our service");
}
}
public static void callregister () {
System.out.print("""
1 -> missed call
2 -> received call
3 -> dialled numbers
4 -> erase recent calls lists
5 -> show call duration
6 -> show call costs
7 -> call cost settings
8 -> prepaid credit
		""");
int tolu7 = obaturn.nextInt();
switch(tolu7) {
case 1 -> System.out.println("missed calls");
case 2 -> System.out.println("received calls");
case 3 -> System.out.println("dialled numbers");
case 4 -> System.out.println("erase recent calls lists");
case 5 -> showcallduration ();
case 6 -> showcallscost ();
case 7 -> callcostsettings ();
case 8 -> System.out.println("prepaid credit");
default -> System.out.println("pls kindly go back");    
}
}
public static void showcallduration (){
System.out.print("""
1 -> last call duration
2 -> all calls duration
3 -> received call duration
4 -> dialled calls duration
5 -> clear timers
		""");
int tolu8 = obaturn.nextInt();
switch(tolu8) {
case 1 -> System.out.println("last call duration");
case 2 -> System.out.println("all calls duration");
case 3 -> System.out.println("received call duration");
case 4 -> System.out.println("dialled calls duration");
case 5 -> System.out.println("clear timers");
default -> System.out.println("this is not part of our main service use ur sense");
}
}
public static void showcallscost () {
System.out.print("""
1 -> last call cost
2 -> all calls cost
3 -> clear counters
		""");
int tolu9 = obaturn.nextInt();
switch(tolu9) {
case 1 -> System.out.println("last call cost");
case 2 -> System.out.println("all call cost");
case 3 -> System.out.println("clear counters");
default -> System.out.println("this is not part of our main service kindly go back");
}
}
public static void callcostsettings () {
System.out.print("""  
1 -> call cost limit
2 -> show cost in
		""");
int tolu10 = obaturn.nextInt();
switch(tolu10) {
case 1 -> System.out.println("call cost limit");
case 2 -> System.out.println("show cost in");
default -> System.out.println("go back to the main or press exit");
}
}
public static void tones() {
System.out.print("""
1 -> ringing tone
2 -> ringing volume
3 -> incoming call alert
4 -> composer
5 -> message alert tone
6 -> keypad tones
7 -> warming and gaming tones
8 -> vibrating alert
9 -> screen saver
		""");
int tolu11 = obaturn.nextInt ();
switch(tolu11) {
case 1 -> System.out.println("ringing tone");
case 2 -> System.out.println("ringing volume");
case 3 -> System.out.println("incoming call alert");
case 4 -> System.out.println("composer");
case 5 -> System.out.println("message alert tone");
case 6 -> System.out.println("keypad tones");
case 7 -> System.out.println("warming and gaming tones");
case 8 -> System.out.println("vibrating alert");
case 9 -> System.out.println("screen saver");
default -> System.out.println("kindly go back to the main service");
}
}
public static void settings () {
System.out.print("""
1 -> call settings
2 -> phone settings
3 -> security setiings
4 -> restore factory settings
		""");
int tolu12 = obaturn.nextInt();
switch(tolu12) {
case 1 -> callsettings ();
case 2 -> phonesettings ();
case 3 -> securitysettings ();
case 4 -> System.out.println("restore factory settings");
default -> System.out.println("go back to the main menu");
}
}
public static void callsettings () {
System.out.print("""
1 -> automatic redial
2 -> speed dials
3 -> call waiting options
4 -> own number sending
5 -> phone line in use
6 -> automatic answer
		""");
int tolu13 = obaturn.nextInt();
switch(tolu13) {
case 1 -> System.out.println("automatic redial");
case 2 -> System.out.println("speed dials");
case 3 -> System.out.println("call waiting options");
case 4 -> System.out.println("own number sending");
case 5 -> System.out.println("phone line in use");
case 6 -> System.out.println("automatic answer");
default -> System.out.println("use your sense");
}
}
public static void phonesettings () {
System.out.print("""
1 -> language
2 -> cell info display
3 -> welcome note
4 -> network selection
5 -> lights
6 -> confirm sim service actions
		""");
int tolu14 = obaturn.nextInt();
switch(tolu14) {
case 1 -> System.out.println("language");
case 2 -> System.out.println("cell info display");
case 3 -> System.out.println("welcome note");
case 4 -> System.out.println("network selection");
case 5 -> System.out.println("lights");
case 6 -> System.out.println("confirm sim service");
default -> System.out.println("go back to the main menu by using your sense");
}
}
public static void securitysettings () {
System.out.print("""
1 -> pin code request
2 -> call barring service
3 -> fixed dialling
4 -> closed user group
5 -> phone security
6 -> change access codes
		""");
int tolu15 = obaturn.nextInt ();
switch(tolu15) {
case 1 -> System.out.println("pin code request");
case 2 -> System.out.println("call barring service");
case 3 -> System.out.println("fixed dialling");
case 4 -> System.out.println("closed user group");
case 5 -> System.out.println("phone security settings");
case 6 -> System.out.println("change access codes");
default -> System.out.println("can you kindly pls go back to the main menu");
}
}
public static void calldivert () {
System.out.print("""
1 -> welcome to call divert
2 -> laid down your complain	
3 -> having network  issue
		""");
int tolu16 = obaturn.nextInt();
switch(tolu16) {
case 1 -> System.out.println("welcome to call divert");
case 2 -> System.out.println("laid down your complain");
case 3 -> System.out.println(" having network issue");
default -> System.out.println("go back to the main menu");
}
}
public static void games () {
System.out.print("""
1 -> temple run play
2 -> dream league
3 -> car drive
		""");
int tolu17 = obaturn.nextInt();
switch(tolu17) {
case 1 -> System.out.println("temple run play");
case 2 -> System.out.println("dream league");
case 3 -> System.out.println("car drive");
default -> System.out.println("not in this service");
}
}
public static void calculator () {
System.out.print("""
1 -> division
2 -> multiplication
3 -> subtraction
4 -> addition
		""");
int tolu18 = obaturn.nextInt();
switch(tolu18){
case 1 -> System.out.println("divison");
case 2 -> System.out.println("multiplication");
case 3 -> System.out.println("subtraction");
case 4 -> System.out.println("addition");
default -> System.out.println("out of bound of this place");
}
}
public static void reminders() {
System.out.print("""
1 -> welcome to reminders
2 -> what do we offer you
		""");
int tolu19 = obaturn.nextInt();
switch(tolu19) {
case 1 -> System.out.println("welcome to reminders");
case 2 -> System.out.println("what do we offer you");
default -> System.out.println("out of bound");
}
}
public static void clock() {
System.out.print("""
1 -> alarm clock
2 -> clock settings
3 -> date settings
4 -> stop watch
5 -> count down timer
6 -> auto update of date and time
		""");
int tolu20 = obaturn.nextInt();
switch(tolu20) {
case 1 -> System.out.println("alarm clock");
case 2 -> System.out.println("clock settings");
case 3 -> System.out.println("date settings");
case 4 -> System.out.println("stop watch");
case 5 -> System.out.println("count down timer");
case 6 -> System.out.println("auto update of date and time");
default -> System.out.println("use your sense this is not part of service");
}
}
public static void profiles () {
System.out.print("""
1 -> welcome to profiles
2 -> ringing volume
3 -> set reminder
4 -> change background colour
5 -> having media issue
		""");
int tolu21 = obaturn.nextInt();
switch(tolu21) {
case 1 -> System.out.println("welcome to profiles");
case 2 -> System.out.println("ringing volume");
case 3 -> System.out.println("set reminder");
case 4 -> System.out.println("change background colour");
case 5 -> System.out.println("having media issue");
default -> System.out.println("out of bound not in main service");
}
}
public static void simservice (){
System.out.print("""
1 -> sub data
2 -> borrow card
3 -> do subcription
4 -> share data
5 -> laid down complain
6 -> register new account
		""");
int tolu22 = obaturn.nextInt();
switch(tolu22) {
case 1 -> System.out.println("sub data");
case 2 -> System.out.println("borrow card");
case 3 -> System.out.println("do subcription");
case 4 -> System.out.println("share data");
case 5 -> System.out.println("laid down complain");
case 6 -> System.out.println("register new account");
default -> System.out.println("not part of our services");
}
}


public static void main(String[] args) {

MainMenu();
phonebook();
messages ();
chat ();
callregister ();
tones();
settings ();
calldivert ();
games ();
calculator ();
reminders ();
clock ();
profiles ();
simservice();
}
}
































































































  