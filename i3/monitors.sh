#!/bin/bash
#intern=eDP-1
#extern=HDMI-1
intern=eDP1
extern=DP1

if xrandr | grep "$extern disconnected"; then
    xrandr --output "$extern" --off --output "$intern" --auto
else
    xrandr --output "$intern" --off --output "$extern" --auto
fi
