# Item Scheduler by Kelly Johnston

As a side note, it has been a while since I have created a project and also needed to parse json. I worked with a lot of legacy code that I refactored.

First thing I did was create a model class

Second thing was research how to get the json from a URL. I was unsuccessful at my attempts and took a bit longer. I instead included the json file in the project and read from the file

Next I worked on parsing the JSON and connecting the parser to the model.

Lastly I worked on the UI level

As I already spent more than the alloted time on the project, here is a list of things I would have added:

## TODO

Create two build configurations and display it as a or b when either is deployed respectively
    - I do have two different flavors for the app: a demo and a full one
    - I did not have time to separate the code into two different packages (in hindsight, I would have started with this)
    - To display demo or full to be displayed in the app, I would have created an enum as a buildConfig for each which would be set
    - Then I would have in the xml where it displays the text Build flavor, I would have checked the build flavor and set the string accordingly. 
    I commented out the lines in the build.gradle file since I was having issues finding the correct gradle plugin

Unit Tests
    - As mentioned, getting the json file from the server
    - I would not add a unit test for the model as it is just getters and setters.
    - I would have added several test cases for each method in my parser. 
        + Testing that the URL was found, 
        + data was retrieved from the url 
        + storing data properly in the model
        + checking for no data
        + values missing in the json
        + data parsed correctly
        + file opens properly