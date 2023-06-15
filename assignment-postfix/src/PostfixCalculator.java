public class PostfixCalculator
{
    public PostfixCalculator()
    {
    }

    public static String infix2postfix(String infix)
    {
        // Algorithm to convert infix string to postfix string
        //
        // create an empty string for postfix expression
        // create a stack of strings
        // tokenize the infix expression with a delimiter of space
        //
        // while tokenizer has more tokens
        //   token = get next token from tokenizer
        //
        //   if token is an open parenthesis
        //     push token on stack
        //
        //   else if token is a close parenthesis
        //     operator = pop top from stack
        //     while operator doesn't equal open parenthesis
        //       append operator and a single space to postfix expression
        //       operator = pop top from stack
        //
        //   else if token is an operator
        //     while stack is not empty and precedence of token is less than top of stack (peek)
        //       pop top from stack and append it and single space to postfix expression
        //     after loop, push operator token onto stack
        //
        //   else
        //     append token and single space to postfix expression
        //
        //

        //
        // while stack is not empty
        //   pop and append operator and single space to postfix expression
        //
        //  return postfix expression

        return "";
    }

    public static double solve(String postfix)
    {
        // Algorithm to solve postfix expression
        //
        // create a stack of doubles
        // tokenize the postfix expression with a delimiter of space
        //
        // while tokenizer has more tokens
        //   token = get next token from tokenizer
        //
        //   if token is an operator
        //     operand b = pop top of stack
        //     operand a = pop top of stack
        //     result = a operator b
        //     push result onto stack
        //
        //   else
        //     convert token to double and push onto stack
        //
        // there should only be 1 element left in the stack now
        // if there is more than 1 element or the stack is empty, you have a bug
        // answer = pop off top of stack
        //
        // return answer

        return 0;
    }
}