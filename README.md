<h1>Extra things I've learned</h1>

1. How to remove a commit that is already pushed to Github:
   For example, if commit 7f6d03 was made before the wrongful commits:
   ```
   git reset 7f6d03 --hard
   git push origin -f
   ```
2.  If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
