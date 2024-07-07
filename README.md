<h1>Extra things I've learned from my mistakes!</h1>

1. How to remove a commit that is already pushed to Github:
   For example, if commit 7f6d03 was made before the wrongful commits:
   ```
   git reset 7f6d03 --hard
   git push origin -f
   ```
