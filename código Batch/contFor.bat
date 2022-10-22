@echo off
echo 0 ate 100
for /l %%X in (1,1,99) do (echo %%X >> E:\count.txt)
pause > nul