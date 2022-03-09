import java.util.Arrays;

public class Encryptor
{
    /** A two-dimensional array of single-character strings, instantiated in the constructor */
    private String[][] letterBlock;

    /** The number of rows of letterBlock, set by the constructor */
    private int numRows;

    /** The number of columns of letterBlock, set by the constructor */
    private int numCols;

    /** Constructor*/
    public Encryptor(int r, int c)
    {
        letterBlock = new String[r][c];
        numRows = r;
        numCols = c;
    }

    public String[][] getLetterBlock()
    {
        return letterBlock;
    }

    /** Places a string into letterBlock in row-major order.
     *
     *   @param str  the string to be processed
     *
     *   Postcondition:
     *     if str.length() < numRows * numCols, "A" in each unfilled cell
     *     if str.length() > numRows * numCols, trailing characters are ignored
     */
    public void fillBlock(String str)
    {
        int count = 0;
        for (int r = 0; r < letterBlock.length; r++)
        {
            for (int c = 0; c < letterBlock[0].length; c++)
            {
                if (count < str.length())
                {
                    letterBlock[r][c] = str.substring(count, count + 1);
                    count++;
                }
                else
                {
                    letterBlock[r][c] = "A";
                }
            }
        }
    }

    /** Extracts encrypted string from letterBlock in column-major order.
     *
     *   Precondition: letterBlock has been filled
     *
     *   @return the encrypted string from letterBlock
     */
    public String encryptBlock()
    {
        String product = "";
        for (int c = 0; c < letterBlock[0].length; c++)
        {
            for (int r = 0; r < letterBlock.length; r++)
            {
                product += letterBlock[r][c];
            }
        }
        return product;
    }

    /** Encrypts a message.
     *
     *  @param message the string to be encrypted
     *
     *  @return the encrypted message; if message is the empty string, returns the empty string
     */
    public String encryptMessage(String message)
    {
        String encryptMes = "";
        int time = message.length() / (numRows * numCols);
        if (message.length() % (numRows * numCols) > 0)
        {
            time++;
        }
        for (int i = 0; i < time; i++)
        {
            fillBlock(message);
            encryptMes += encryptBlock();
            if (i < time - 1)
            {
                message = message.substring(numRows * numCols);
            }
        }

        return encryptMes;
    }

    /**  Decrypts an encrypted message. All filler 'A's that may have been
     *   added during encryption will be removed, so this assumes that the
     *   original message (BEFORE it was encrypted) did NOT end in a capital A!
     *
     *   NOTE! When you are decrypting an encrypted message,
     *         be sure that you have initialized your Encryptor object
     *         with the same row/column used to encrypted the message! (i.e.
     *         the “encryption key” that is necessary for successful decryption)
     *         This is outlined in the precondition below.
     *
     *   Precondition: the Encryptor object being used for decryption has been
     *                 initialized with the same number of rows and columns
     *                 as was used for the Encryptor object used for encryption.
     *
     *   @param encryptedMessage  the encrypted message to decrypt
     *
     *   @return  the decrypted, original message (which had been encrypted)
     *
     *   TIP: You are encouraged to create other helper methods as you see fit
     *        (e.g. a method to decrypt each section of the decrypted message,
     *         similar to how encryptBlock was used)
     */
    public String decryptMessage(String encryptedMessage)
    {
        String decryptMes = "";
        int time = encryptedMessage.length() / (numRows * numCols);
        for (int i = 0; i < time; i++)
        {
            int count = 0;
            for (int c = 0; c < numCols; c++)
            {
                for (int r = 0; r < numRows; r++)
                {
                    if (count < encryptedMessage.length())
                    {
                        letterBlock[r][c] = encryptedMessage.substring(count, count + 1);
                        count++;
                    }
                }
            }
            for (int r = 0; r < numRows; r++)
            {
                for (int c = 0; c < numCols; c++)
                {
                    decryptMes += letterBlock[r][c];
                }
            }
            encryptedMessage = encryptedMessage.substring(numRows * numCols);
        }
        return decryptMes;
    }
}
