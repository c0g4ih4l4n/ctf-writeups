## Secure Notes

> None of the free note taking app offer encryption... So I made my own!

App contain Pin screen to decrypt `secret.db`
After decompile apk file, i detect decrypt Pin code function on `Login Activity`: `d.k`
![dec.png](dec.png?raw=true "Title")
Copy decrypt code to Java file and brute force it with PIN have 4-char.
![dk.png](dk.png?raw=true "Title")
Many code valid without through Exceptions 
![output.png](output.png?raw=true "Title")
i try to grep flag from all output and get the result.
![grepflag.png](grepflag.png?raw=true "Title")