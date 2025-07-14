let role = 'guest';

switch (role) {
    case 'guest':
        console.log('Guest User');
        break;
    case 'moderator':
        console.log('moderator user');
        break;
    default:
        console.log('unknown user');
}

if (role === 'guest') {
    console.log('This is a guest user');
} else if (role === 'moderator') {
    console.log('This is a moderator user');
} else {
    console.log('This is an unknown user');
}