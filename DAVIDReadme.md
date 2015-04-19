David Kelly 13127390 - Control / Logic

Simon Boelsch 14435708 - Quiz

John Cunningham 14376696 - Safety

Alex Wong 14364196 - Experiments



Key Files :: firstFrame, Controller and MainMenu

My role in the project was to enable the control flow of the application.

In `firstFrame`, the user selects a subject and year group.
My code saves these and exposes the variables through the use of simple methods

In the `MainMenu`, my colleagues are able to make method calls and select where to go based on the selected variables.

In detail, the `firstFrame` class creates an instance of the `Controller`.

The `set` methods are fed with the comboBox items on submission of the page.
The `Controller` class has methods which allow the variables to be written to a file.

This allows retrieval of the variables after the `dispose();` method call.
The `readIn `method from the controller class reloads the variables from the files.