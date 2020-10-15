# User Guide

## Introduction

SCRUMptious is a command line software for project management designed for project managers following the scrum methodology to develop it. 

## Table of Contents

1. Quick Start
1. Features
    1. Project `project`
        1. Create a new project
        1. View project information
        1. Add team members
        1. Remove team members
    1. Project Backlog `task`
        1. Create backlog items
        1. View backlog items
        1. Add tasks
        1. View tasks
        1. Delete tasks
        1. Change the priority of tasks
        1. Mark tasks as complete
    1. Sprint `sprint`
        1. Create a new sprint
        1. View sprint information
        1. Add tasks to the sprint
        1. Delete tasks from the sprint
        1. Allocate tasks to team members
1. Command Summary


## Quick Start

1. Ensure that you have Java 11 or above installed.
1. Down the latest version of `Scrumptious.jar` from [here](http://link.to/duke)
1. Copy the jar file into an empty folder.
1. Ensure that you have a functional Command Line Interface (CLI).
1. Run the command `java -jar C:\Scrumptious\Scrumptious.jar`. Ensure that the `Scrumptious.jar` filepath is specified 
correctly according to where you copied it to.
1. Type the command `project /create -title Scrumptious -desc A java project -end 30 -sd 10` 
into the command line and press `Enter` to execute it.
1. If te setup is correct, you should see something like this:
    ```
   Project successfully created.
   ```

## Features 

### Project `project`
#### Create Project
Create a new project  
* Format: `project /create -title <title> -desc <description> -dur <duration> -sd <sprint interval>`  
* Tags:  
    * `-title`: Specify the title of the project
    * `-esc`: Specify the project description
    * `dur`: Specify the duration of the project. (Number of days)
    * `-sd`: Specify the duration of a sprint. (Number of days)
* Constraints: All tags are to be specified when creating a new project.
* Example: `project /create -title MeTube -desc video streaming software -dur 90 -sd 10`
    * Creates a project titled MeTube which is a video streaming software. 
    * The project will last for 90 days and the sprints will run on a 10 day interval.

#### View project information
View project information which includes title, description, time-period and team members of the project. 
It displays the project backlog, and the details of the ongoing sprint.
* Format: `project /view`
* Constraints:
    * A project must be created by the user before using this command.
* Example: `project /view`
* Expected outcome:
     ```
    ================= PROJECT =================
    [Title: MeTube ]
    [Description: video streaming software ]
    [No members added]
    [Project will start along with the first sprint]
    [Project backlog is empty]
    [There are no Sprints]
    
    ===============================================
    ```
  
#### Add team members into project `member`
Add team members into the project.  
* Format: `member /add <username> [<username> ...]`
* Constraints:
    * At least one username must be specified
    * Username must be an alphanumeric String
* Example: `member /add john mary`
* Expected outcome:
    ```
  john has been added to the project.
  mary has been added to the project.
  ```

#### Remove team members from project 
Remove team members from the project
* Format: `member /del <username> [<username> ...]`
* Constraints:
    * At least one username must be specified
    * Username must be an alphanumeric String
* Example: `member /del john mary`
* Expected outcome:
    ```
  john has been removed from the project.
  mary has been removed from the project.
  ```
  
### Project Backlog `task`
#### Add tasks
Adds a task to the backlog.
* Format: `task /add -title <title> -desc <description> -priority <category>`
* Tags:
    * `-title`: Specify the task title
    * `-desc`: Specify the task description
    * `-priority`: Specify the task priority as HIGH, MEDIUM or LOW.
* Constraints: All tags are to be specified when adding a new task.
* Example: `task /add -title Add parser -desc add an interactive UI -priority HIGH`
* Expected outcome:
    ```
    
    ```

#### View tasks
Views the specified task.
* Format: `task /view <taskid>`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
* Example: `task /view 3`
* Expected outcome:
    ```
    
    ```
  
#### Delete tasks
Deletes the specified task.
* Format: `task /del <task id> [<task id>...]`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
* Example: `task /del 5 7 9`
* Expected outcome:
    ```
    
    ```
#### Change priority of tasks
Change the priority of the specified task.
* Format: `task /priority -priority <category> -id <task id>`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
    * `-category` must be HIGH, MEDIUM or LOW.
* Example: `task /priority -priority HIGH -id 4`
* Expected outcome:
    ```
    
    ```
  
#### Mark tasks as complete
Marks specified task as complete.
* Format: `task /done <task id>`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
* Example: `task /done 3`
* Expected outcome:
    ```
    
    ```
  
### Sprint `sprint`
#### Create a new sprint
Creates a new sprint for the project.
* Format: `sprint /create -goal <goal> -start <DDMMYYYY>`
* Constraints:
    * `goal` must be specified
* Example: `sprint /create Shopping Cart`
* Expected outcome:
    ```
    
    ```
  
#### View the sprint
Display the information of the sprint.
* Format: `sprint /view`
* Example: `sprint /view`
* Expected outcome:
    ```
    
    ```
  
#### Add tasks to the sprint
Adding the specified task(s) from the backlog items to the current sprint
* Format: `sprint /addtask <task id> [<task id> …]`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
* Example: `sprint /addtask 123 456 789`
* Expected outcome:
    ```
    
    ```
  
#### Delete tasks from the sprint
Removing the specified task(s) from the sprint
* Format: `sprint /deltask <task id> [<task id> …]`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
* Example: `sprint /deltask 123 456 789`
* Expected outcome:
    ```
    
    ```
  
#### Allocate tasks to team members
Assigning a task to a team member
* Format: `sprint /assign <task id> <user id> [<user id> …]`
* Constraints:
    * `task id` must be a positive integer
    * `task id` must be specified
    * `user id` must be specified
* Example: `sprint /assign 123 johntan mary jane`
* Expected outcome:
    ```
    
    ```

## Command Summary

| **Action** | **Format** | **Examples** |
| --- | --- | --- |
| Create | project /create -title <title> -desc <description> -dur <duration> -sd <sprint interval> | `project /create -title MeTube -desc video streaming software -dur 90 -sd 10` |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |
|  |  |  |