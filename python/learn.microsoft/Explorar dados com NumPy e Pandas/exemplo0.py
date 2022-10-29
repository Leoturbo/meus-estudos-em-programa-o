#Explorando matrizes de dados com NumPy
import numpy as np

data = [50,50,47,97,49,3,53,42,26,74,82,62,37,15,70,27,36,35,48,52,63,64]
print(data)

grades = np.array(data)
print(grades)


print(type(data), 'x2:', data * 2)
print('---')
print(type(grades), 'x 2:', grades * 2)

grades._shape

grades[0]
grades.mean()

# Define an array of study hours
study_hours = [10.0,11.5,9.0,16.0,9.25,1.0,11.5,9.0,8.5,14.5,15.5,
               13.75,9.0,8.0,15.5,8.0,9.0,6.0,10.0,12.0,12.5,12.0]

# Create a 2D array (an array of arrays)
student_data = np.array([study_hours, grades])

# display the array
student_data

student_data.shape