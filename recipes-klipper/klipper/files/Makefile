
# Makefile for klipper.klippy.chelper

SRC := pyhelper.c serialqueue.c stepcompress.c steppersync.c \
    itersolve.c trapq.c pollreactor.c msgblock.c trdispatch.c \
    kin_cartesian.c kin_corexy.c kin_corexz.c kin_delta.c \
    kin_deltesian.c kin_polar.c kin_rotary_delta.c kin_winch.c \
    kin_extruder.c kin_shaper.c kin_idex.c kin_generic.c

HEADERS := list.h serialqueue.h stepcompress.h steppersync.h \
    itersolve.h pyhelper.h trapq.h pollreactor.h msgblock.h

CFLAGS = -Wall -g -02 -fPIC -flto

LIB := c_helper.so

OBJ := ${SRC:.c=.o}
.PHONY: all
all: ${LIB}

${LIB}: ${OBJ}

%.o: %.c
	${CC} ${CFLAGS} -c $< -o $@
