
# Makefile for klipper.klippy.chelper

SRC := pyhelper.c serialqueue.c stepcompress.c steppersync.c \
    itersolve.c trapq.c pollreactor.c msgblock.c trdispatch.c \
    kin_cartesian.c kin_corexy.c kin_corexz.c kin_delta.c \
    kin_deltesian.c kin_polar.c kin_rotary_delta.c kin_winch.c \
    kin_extruder.c kin_shaper.c kin_idex.c kin_generic.c

HEADERS := list.h serialqueue.h stepcompress.h steppersync.h \
    itersolve.h pyhelper.h trapq.h pollreactor.h msgblock.h

myCFLAGS = -Wall -g -shared -o2 -fPIC -flto -fwhole-program -fno-use-linker-plugin

LIB := c_helper.so
OBJ := ${SRC:.c=.o}

.PHONY: all
all: ${LIB}

${LIB}: ${OBJ}
	${CC} ${LDFLAGS} ${myCFLAGS} $< -o $@

%.o: %.c
	${CC} ${CFLAGS} ${myCFLAGS} -c $< -o $@

.PHONY: clean_obj
clean_obj:
	rm -rf ${OBJ}

.PHONY: clean
clean:
	rm ${LIB}
	rm -rf ${OBJ}
