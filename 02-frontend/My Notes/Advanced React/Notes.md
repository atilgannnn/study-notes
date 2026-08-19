*** Error Example (Lesson 79) ***

-- We tried to create an app that will increase the displayed number whenever we click on the button. Even if the code seems right, it does not increase the number on the browser and when we check the website with inspect and look at the console, numbers increase. Why is that? Because even though we see that it increases on the console, the relevant codes are not rendered and it affects the reflection on the website.

-- In order to fix this, we use a hook called "useState".

*** General Rules of Hooks ***

-- They start with the word "use" (both -react and custom hooks)
-- component must be uppercase
-- invoke inside function/component body
-- don't call hooks conditionally (you don't wanna use it inside of an if block)
-- set functions don't update the state immediately

*** Fetch function ***

-- When it comes to fetch, it doesn't treat 404 as an error.
-- Unlike the axios, which is going to run the code inside of the "catch" part of "try-catch" if you have 404 error, that's not the case with fetch. It's kind of a trap.
-- If we use axios and if there's a 404 error, the functionality will be invoked in the "catch" block.

*** HUGE IMPORTANT NOTE ***

-- Don't use a hook inside a condition (if block)
-- Don't use useEffect after multiple returns

*** useEffect and Toggle ***

-- Basically useEffect works at least once when we do the first render
-- However, using useEffect as an initial value and binding it with a toggle is completely different scenario. When you toggle something, you actually mount and unmount that thing. If you bind it to a useEffect function, every time you toggle, useEffect works. (Check the Lesson 112)

*** PROJECT STRUCTURE ***

-- If your project is big and if you want to navigate in the folders easily and if you don't want to see this repetitive folder/file names like this:

-- import Starter from './tutorial/04-project-structure/starter/Navbar/Navbar';( The last two words are same)

-- Then you have to do this:
-- First, create index.jsx in each folder
-- Second, export the main folder in the index.jsx
-- Finally you can delete the "Navbar" word at the end of the import example above
-- YOU ARE READY TO GO !!!

*** What if I add all those components to App.jsx? Am I gonna need to import each and every component as well?! ***

-- Yes, but you don't have to import them as separately. If you import them one by one, it's gonna take hundreds or thousands of lines for each import and that is not a clean code writing. Instead you can follow these steps:

-- First, you have to create a separate index.jsx file
-- Then you have to import the components from their files in the index.jsx file
-- Right below the imports in index.jsx, you have to export these components
-- Go to App.jsx and import these components in a curly braces
-- YOU ARE READY TO GO !!!

-- If you have any problems about that, check the lessons 117 and 118 OR check the folder "04-project-structure".

*** If I add a lot of components in the App.jsx ***

-- Well you can also have an option for that. If you want to use 1 or 2 components in the App.jsx and make it more manageable, you can do the followings:

-- First create a separate index.jsx and add the components here
-- Then go to App.jsx and add the index.jsx here as a component
-- YOU ARE READY TO GO !!!

*** GLEAN EXTENSION ***

-- This is a really cool one. This extension helps to create a component folder and composes the code block we choose automatically. (Lesson 119)
-- On Lesson 121 there's a nice example for the usage of glean extension.
-- Basically, we choose the code, we click the lightbulb icon on the left and choose "Extract component to file" option. Then we choose the directory for the file and give it a name. Then press "Enter"
-- Everything is ready !!!

*** FORM STRUCTURE (Lesson 123) ***

-- In order to get e-mail or password or something like that from the user, you can use
<input> tag. Don't forget to get them in a <div> tag as well.

*** USING 1 FUNCTION IN A FORM (Lesson 128) ***

-- If you use 1 function to manage the actions in multiple inputs, you have to give them a "name" attribute each.

*** Form API Data ***

-- There's an important difference between e.target && e.currentTarget

-- e.target => refers to the DOM element that triggers an event

-- e.currentTarget => refers to the DOM element that eventListener is listening on

-- On the Lesson 131, e.currentTarget returns our form element.

*** useRef Hook ***

-- It is similar to useState but there's a one major difference

-- When we use useState, technically we trigger the re-render

-- However, when we use useRef, we don't trigger the re-render

*** useReducer ***

-- This is an alternative for useState.

-- Technically, we have to provide two things while creating the useReducer

-- First, we must set a default state
-- Then, we have to give a reducer

*** useMemo ***

-- This is an amazing hook that can help us to render the initial value once at the beginning and does not re-render the initial value over and over again unless we change the initial value (Lesson 163)














