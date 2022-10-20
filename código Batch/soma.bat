@echo off
color 0a
set /p n1= Digite o primeiro numero:
set /p n2= Digite o segundo numero:
set /a soma= %n1% + %n2%
echo %n1% + %n2% = %soma%
pause > nul
exit