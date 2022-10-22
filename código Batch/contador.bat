@echo off
set /a counter=0
:numbers
set /a counter=%counter%+1
if %counter% ==100 (goto :eof) else (echo %counter% >> E:\count.txt)
goto :numbers
pause