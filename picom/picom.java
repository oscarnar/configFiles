# Corners with ibhagwan's fork
corner-radius = 10;
round-borders = 10;
round-borders-exclude = [
    "class_g = 'Polybar'",
    "class_g = 'firefox' && window_type = 'utility'",
    "window_type = 'dock'",
    "_NET_WM_WINDOW_TYPE:a = '_NET_WM_WINDOW_TYPE_DOCK'",
    #"name *= 'Awesome drawin'"
    "name *= 'panel'"
];
rounded-corners-exclude = [
	"class_g = 'Polybar'",
    "class_g = 'firefox' && window_type = 'utility'",
    "window_type = 'dock'",
    "_NET_WM_WINDOW_TYPE:a = '_NET_WM_WINDOW_TYPE_DOCK'",
    #"name *= 'Awesome drawin'"
    "name *= 'panel'"
];

# Shadow
shadow = false;
shadow-radius = 10;
shadow-offset-x = -10;
shadow-offset-y = -10;
shadow-opacity = 0.50;

#shadow-exclude = "(!name = 'rofi' && !class_g = 'Rofi' && !name = 'dunst' && !class_g = 'Dunst' && !class_g *?= 'Polybar')"

shadow-exclude = [
    "class_g *?= 'jgmenu'",
    "class_g *?= 'VirtualBox'",
    "class_g *?= 'Conky'",
    "class_g *?= 'Notify-osd'",
    "class_g *?= 'cairo-dock'",
    "class_g *?= 'trayer'",
    "class_g *?= 'navigator'",
    "class_g *?= 'Cairo-clock'",
    "class_g *?= 'Cairo-dock'",
    "class_g *?= 'Polybar'",
    "class_g *?= 'Docky'",
    "class_g = 'boox'",
    "class_g = 'hacksaw'",
    "window_type *= 'normal' && ! name ~= ''",
    "_NET_WM_STATE@:32a *= '_NET_WM_STATE_HIDDEN'",
    #"window_type = 'dock'",
    "name *= 'panel'",
    "_GTK_FRAME_EXTENTS@:c",
    "name *= 'Awesome drawin'"
];



# Fade
fading = true;
fade-delta = 2;  # 30;
fade-in-step = 0.01;
fade-out-step = 0.01;
no-fading-openclose = false;
#fade-exclude = [ "name *= 'panel'",
#];

# Backend
vsync = true;
backend = "glx";
#glx-no-stencil = true;
#glx-no-rebind-pixmap = false;
use-damage = false;
xrender-sync-fence = true;


# Opacity
inactive-opacity-override = false;
#alpha-step = 0.06;
opacity-rule = [
        "100:class_g *?= 'Termite'",
];

focus-exclude = [
    "class_g *?= 'Cairo-clock'",
    "class_g *?= 'Virtualbox'",
    "class_g *?= 'trayer'",
    "_NET_WM_STATE@:32a *= '_NET_WM_STATE_HIDDEN'",
    "name *?= 'Authy'"
];

#blur-background = true;
#blur-method = "dual_kawase";
#blur-strength = 12;
#blur-background-fixed = true;

#blur-background-exclude = [
#   "class_g != 'Thunar'",
#];


wintypes:
{
    tooltip = { fade = true; shadow = false; focus = true; };
};
