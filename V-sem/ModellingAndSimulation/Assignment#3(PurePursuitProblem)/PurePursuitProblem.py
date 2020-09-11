#!/usr/bin/env python3
import math

def pure_pursuit_simulation(x_fighter, y_fighter, x_bomber, y_bomber, VELOCITY_FIGHTER, MAX_TIME, MAX_RANGE):
    t = 0
    while t < 12:
        distance = math.sqrt(((x_bomber[t] - x_fighter[t])**2) + ((y_bomber[t] - y_fighter[t])**2))
        print('x_f :', '{:.2f}'.format(x_fighter[t]), ',y_f :', '{:.2f}'.format(y_fighter[t]), end = "")
        print('\tx_b :', '{:.2f}'.format(x_bomber[t]), ',y_b :', '{:.2f}'.format(y_bomber[t]), end = "")
        print('\tDistance :', '{:.2f}'.format(distance),'KMS', end = "")
        print('\tTime : ', t)

        if distance <= MAX_RANGE:
            break;
        x_fighter[t + 1] = x_fighter[t] + VELOCITY_FIGHTER * ((x_bomber[t] - x_fighter[t]) / distance)
        y_fighter[t + 1] = y_fighter[t] + VELOCITY_FIGHTER * ((y_bomber[t] - y_fighter[t]) / distance)
        t += 1
    if t < 12:
        print('\nBomber Destroyed At Time =', t, ', Distance= ', '{:.2f}'.format(distance), 'kms')
    else:
        print('\nBomber Escaped...')

MAX_TIME = 12   # MAX Time To Attack Bomber
MAX_RANGE = 10  # MAX Distance Fighter Can Attack
VELOCITY_FIGHTER = 20 # Velocity of Fighter

# Bomber path
x_bomber = [80, 90, 99, 108, 116, 125, 133, 141, 151, 160, 169, 179, 180]
y_bomber = [0, -2, -5, -9, -15, -18, -23, -29, -28, -25, -21,-20, -17]

# Initial Position of Fighter
x_fighter = [0] * 12
y_fighter = [0] * 12

x_fighter[0] = 0
y_fighter[0] = 50

pure_pursuit_simulation(x_fighter, y_fighter, x_bomber, y_bomber, VELOCITY_FIGHTER, MAX_TIME, MAX_RANGE)