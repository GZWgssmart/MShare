package top.zywork.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Encoder;
import top.zywork.enums.AlgorithmEnum;
import top.zywork.enums.CharsetEnum;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类<br />
 * 创建于2017-08-15<br />
 * 修改于2017-09-04，增加salt<br />
 *
 * @author 王振宇
 * @version 1.1
 * @see top.zywork.enums.AlgorithmEnum
 */
public class EncryptUtils {

    private static final Logger logger = LoggerFactory.getLogger(EncryptUtils.class);

    /**
     * 不使用盐值的md5加密
     * @param str 明文
     * @return 使用MD5加密算法得到的密文
     */
    public static String md5(String str) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, "",  AlgorithmEnum.MD5.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 使用盐值的md5加密
     * @param str 明文
     * @param salt 盐值
     * @return 使用md5加密算法并加入盐值加密得到的密文
     */
    public static String md5(String str, String salt) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, salt, AlgorithmEnum.MD5.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 不使用盐值的sha1加密
     * @param str 明文
     * @return 使用sha1加密算法得到的密文
     */
    public static String sha1(String str) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, "", AlgorithmEnum.SHA1.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 使用盐值的sha1加密
     * @param str 明文
     * @param salt 盐值
     * @return 使用sha1加密算法并加入盐值加密得到的密文
     */
    public static String sha1(String str, String salt) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, salt,  AlgorithmEnum.SHA1.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 不使用盐值的sha256加密
     * @param str 明文
     * @return 使用sha1加密算法得到的密文
     */
    public static String sha256(String str) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, "", AlgorithmEnum.SHA256.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 使用盐值的sha256加密
     * @param str 明文
     * @param salt 盐值
     * @return 使用sha1加密算法并加入盐值加密得到的密文
     */
    public static String sha256(String str, String salt) {
        String encryptStr = null;
        try {
            encryptStr = oneWayEncrypt(str, salt,  AlgorithmEnum.SHA256.getValue());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return encryptStr;
    }

    /**
     * 单向加密，使用Base64编码
     * @param str 需要加密的明文
     * @param salt 加密所使用的盐值
     * @param type 加密或消息摘要算法名称
     * @return 通过指定加密算法和盐值得到的密文
     * @throws NoSuchAlgorithmException 未知的算法
     * @throws UnsupportedEncodingException 不支持的编码方式
     */
    public static String oneWayEncrypt(String str, String salt, String type) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance(type);
        BASE64Encoder encoder = new BASE64Encoder();
        byte[] bytes = (str + salt).getBytes(CharsetEnum.UTF8.getValue());
        return encoder.encode(md.digest(bytes));
    }

}
