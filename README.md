ScoreBoard [![Build Status](https://secure.travis-ci.org/frankbille/ScoreBoard.png)](http://travis-ci.org/frankbille/ScoreBoard) [![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/frankbille/scoreboard/trend.png)](https://bitdeli.com/free "Bitdeli Badge")
==========
ScoreBoard is a web based system, to keep track of game results and player stats for small office games. It is initially designed to keep track of [Foosball][foosball] scores.

Following are the instructions to get the projectc set up and run the test suite in Eclispse:
 
Build instructions (for developers using Eclipse)
-------------------------------------------------

 1. Install [Eclipse IDE for Java Developers][eclipse]
 2. Start Eclipse
 3. Select File -> Import -> Git -> Projects from Git and click Next
 4. Select URI and Next
 5. Paste the URI git@github.com:frankbille/ScoreBoard.git
 7. Select the branches you want (normally just all of them) and click Next
 8. Select where the local clone should be stored and click Next
 9. Select "Import existing projects" and Finish
10. Since it is a maven project, dependencies will be downloaded and
    it will be automatically built,
11. Run the test suite as is using coverage as->Juint test and see the existing coverage.
12. Then add the following 2 test cases,
ScoreBoard\unit-testcases\TestTrueSkill1.java & ScoreBoard\unit-testcases\TestTrueSkill1.java

into: ScoreBoard\src\test\java\dk\frankbille\scoreboard\ratings\trueskill
13. Re-run the test suite to see the improvement in coverage
