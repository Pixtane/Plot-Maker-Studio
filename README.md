# Plot-Maker-Studio
This project was written in JavaFX using scene builder and maven to import other libraries.
In this app you can creat blocks with title image description and also each block have inner space which can contain some additional blocks.
Also in future there will be groups of blocks that can have blocks inside themselves. 
This can be available in soon future
Each block have 4 button and one entry space in original.

### Block buttons

1. First button is just "**+**" and only add image to the block which it make smaller if it very big.

2. Second button is button inside which go inside the block and give new scene to user where user can also make new blocks. It just like a group of blocks but this group is new scene without other blocks.

3. Third button is Alt button, look like notepad icon. When you click it new window opens where user can write description of the block story.

4. Fourth is button that is used to change button background. It can be used to divide blocks. For example good endings are green and bad - red.

5. And fifth button will just delete block (look like a trash).

### Connectors

Each block and group have two connecting circles. When you drag-and-drop one "give-line" circle to another "get-line" it creates connecting - line. 
To make this I used library [VWalware](https://github.com/miho/VWorkflows) that specifies in that thing - blocks and connectors.

## GROUPS

Groups currently unavailable but I can show concepts which I want to do in future.
Groups are forming by clicking **Add -> Add group**. Or also you can create group by hotkey **Ctrl + Shift + N**

Groups will have buttons to delete group, make smaller, add image, change background, alt button, and two add - add new block inside group and new group of blocks inside group. Also group will have entry pole. 
