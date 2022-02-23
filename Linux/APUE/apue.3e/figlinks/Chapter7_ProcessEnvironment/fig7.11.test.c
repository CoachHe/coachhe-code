#include "apue.h"
#include <setjmp.h>
#include <stdio.h>
#define	TOK_ADD	   5

jmp_buf	jmpbuffer;

int
main(void)
{
	char	line[MAXLINE];
	while (fgets(line, MAXLINE, stdin) != NULL)
    printf("1");
	exit(0);
}

void
cmd_add(void)
{
	if (-1 < 0)		/* an error has occurred */
		longjmp(jmpbuffer, 1);
	/* rest of processing for this command */
}

void prin(void)
{
	if (setjmp(jmpbuffer) != 0)
  printf("1");
}
