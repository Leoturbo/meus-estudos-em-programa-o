@echo off
:Loop
color 0a
title Verificador de idades
echo Ola, usuario!
echo.
set /p i= Por favor, digite a sua idade:
set /a i=%i%
if %i% lss 18 (
    echo Voce e menor de idade, tem apenas %i% anos...
    pause
     
)
if %i% gtr 17 (
    echo Voce e maior de idade, ja tem %i% anos...
    pause
    exit
)
cls

goto Loop