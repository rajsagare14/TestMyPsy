
# Add your own tests to the app

## Follow the Procedure Below

### Step 1: **Make changes to activity_main.xml file**.
1. Copy the linear layout code for the test name and button and paste it right below.
2. Change the id of button and the text box (otherwise it will show errors).
3. Open strings.xml and add a new line in the bottom in which you mention name of the test.
4. Go back to activity_main.xml and in the TextViews **android: text = ""** field add the id of test name which you just added in strings.xml.<br>For example: **android: text = "@string/radhikaTest1"**.
5. Just below the TextView is the Button.
Note the id of button. It will be required later.

### Step 2: **Make the button go to the test page on clicking**
1. Go to the project window and right click on app folder -> select New -> select Activity -> select Empty Activity
2. Name this activity with your test names short form avoid using underscore in the activity name.
3. Click on the Finish or Create or Ok button to create a new empty activity.
4. The .xml and .kt file will open up for the same.
5. Now go to MainActivity.kt and replicate the piece of code<br><br>**val QOLButton = findViewById<Button>(R.id.QOLTestButton)**<br>**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QOLButton.setOnClickListener {**<br>**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;val intent = Intent(this,QOLTest::class.java)**<br>**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;startActivity(intent)**<br>**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}**<br><br>
6. Give a unique name in place of **val QOLButton = findViewById<Button>(R.id.QOLTestButton)**.
7. In Place of QOLTestButton put the button id which you copied in step no 1 point no 5
8. Replace QOLButton with the name of variable you chose in step no 2 point no 6
9. In Place of **val intent = Intent(this,QOLTest::class.java)**, Replace QOLTest with the name of activity you created in step no 2 point no 2.
10. Save everything.
11. Build the app.
12. Run the app.
13. Test the app if it going to a new page
14. Push to git or save as backup.
  
### Step 3: **Add the questions of the test to strings.xml**
1. Open strings.xml
2. Below the last added string line, start adding your questions from the test
3. The name field of the string of questions must be as the short form of your test name followed by 'q' followed by the question number.<br>For example: The 13th question from Quality of Life Test will be IDed as:<br>**qolq13**<br>Where qol is short form of test, q stands for question. and 13 for the question number.

### Step 4: **Adding Questions to Test page**
1. Copy code from **<a href = "https://github.com/rajsagare14/TestMyPsy/blob/main/app/src/main/res/layout/activity_qoltest.xml">activity_qoltest.xml</a>** and paste it into your test pages xml file.  
  
  
  
