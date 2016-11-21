grammar sin;

INT: [0-9]+;
WS:[ \r\n\t]+;

ID:INT;
LCURBR: '(';
RCURBR: ')';

input: 'sin' LCURBR ID RCURBR;