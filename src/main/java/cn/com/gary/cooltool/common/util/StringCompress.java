package cn.com.gary.cooltool.common.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author luxinglin
 * String压缩/解压
 */
public class StringCompress {
    private static final String CHAR_SET_NAME = "ISO-8859-1";

    public static void main(String[] args) {
        String str = "{\"companyId\":118,\"taskId\":509,\"resources\":[{\"resKey\":\"118.10.200.131.172.1\",\"resName\":\"大厦机房UPS01\",\"location\":\"总部小机房\",\"deviceCode\":\"B1-UPS01\",\"resCategoryCode\":\"IDC_UPS\"},{\"resKey\":\"118.10.200.131.172.2\",\"resName\":\"大厦机房列头柜01\",\"location\":\"总部小机房\",\"deviceCode\":\"B1-RPP01\",\"resCategoryCode\":\"IDC_RPP\"},{\"resKey\":\"118.10.200.131.172.3\",\"resName\":\"PG-AU-01-01 UPS主输出\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-01\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.4\",\"resName\":\"PG-AU-01-02 维修旁路\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-02\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.5\",\"resName\":\"PG-AU-01-03 备用\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-03\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.6\",\"resName\":\"PG-AU-01-04 交流列头柜A路\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-04\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.7\",\"resName\":\"PG-AU-01-05 四楼监控\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-05\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.8\",\"resName\":\"PG-AU-01-06 监控室\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-06\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.9\",\"resName\":\"PG-AU-01-07 弱电用电\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-07\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.10\",\"resName\":\"PG-AU-01-08 机房精密空调\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-08\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.11\",\"resName\":\"PG-AU-01-09 厨房用电\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-09\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.12\",\"resName\":\"PG-AU-01-10 备用1\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-10\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.13\",\"resName\":\"PG-AU-01-11 备用2\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-11\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.14\",\"resName\":\"PG-AU-01-12 备用3\",\"location\":\"总部配电室\",\"deviceCode\":\"PG-AU-01-12\",\"resCategoryCode\":\"IDC_AU\"},{\"resKey\":\"118.10.200.131.172.15\",\"resName\":\"大厦机房空调01\",\"location\":\"总部配电室\",\"deviceCode\":\"B1-CRAC01\",\"resCategoryCode\":\"IDC_CRAC\"},{\"resKey\":\"118.10.200.131.172.16\",\"resName\":\"大厦机房空调02\",\"location\":\"总部配电室\",\"deviceCode\":\"B1-CRAC02\",\"resCategoryCode\":\"IDC_CRAC\"},{\"resKey\":\"118.10.200.131.172.17\",\"resName\":\"大厦机房空调03\",\"location\":\"总部配电室\",\"deviceCode\":\"B1-CRAC03\",\"resCategoryCode\":\"IDC_CRAC\"},{\"resKey\":\"118.10.200.131.172.18\",\"resName\":\"大厦油机01\",\"location\":\"总部柴油发电机室\",\"deviceCode\":\"B1-GEN01\",\"resCategoryCode\":\"IDC_GEN\"},{\"resKey\":\"118.10.200.131.172.19\",\"resName\":\"大厦油机房温湿度01\",\"location\":\"总部柴油发电机室\",\"deviceCode\":\"B1-YJ-TH01\",\"resCategoryCode\":\"IDC_TH\"},{\"resKey\":\"118.10.200.131.172.20\",\"resName\":\"大厦油机房温湿度02\",\"location\":\"总部柴油发电机室\",\"deviceCode\":\"B1-YJ-TH02\",\"resCategoryCode\":\"IDC_TH\"},{\"resKey\":\"118.10.200.131.172.21\",\"resName\":\"大厦机房温湿度01\",\"location\":\"总部小机房\",\"deviceCode\":\"B1-JF-TH01\",\"resCategoryCode\":\"IDC_TH\"},{\"resKey\":\"118.10.200.131.172.22\",\"resName\":\"大厦机房温湿度02\",\"location\":\"总部小机房\",\"deviceCode\":\"B1-JF-TH02\",\"resCategoryCode\":\"IDC_TH\"},{\"resKey\":\"118.10.200.131.172.24\",\"resName\":\"PG-AA-06-01 3层2号室外机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.25\",\"resName\":\"PG-AA-06-02 2层1号室外机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.26\",\"resName\":\"PG-AA-06-03 4层2号室外机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.27\",\"resName\":\"PG-AA-06-04 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.28\",\"resName\":\"PG-AA-06-05 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.29\",\"resName\":\"PG-AA-06-06 4层3号室外机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.30\",\"resName\":\"PG-AA-06-07 7层2号室外机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-07\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.31\",\"resName\":\"PG-AA-06-08 3-7层新风机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-08\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.32\",\"resName\":\"PG-AA-06-09 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-06-09\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.33\",\"resName\":\"PG-AA-07-01 联络柜\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-07-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.34\",\"resName\":\"PG-AA-07-02 柴发电源\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-07-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.35\",\"resName\":\"PG-AA-09-01 UPS主输入\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.36\",\"resName\":\"PG-AA-09-02 厨房用电（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.37\",\"resName\":\"PG-AA-09-03 消防水泵（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.38\",\"resName\":\"PG-AA-09-04 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.39\",\"resName\":\"PG-AA-09-05 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.40\",\"resName\":\"PG-AA-09-06 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.41\",\"resName\":\"PG-AA-09-07 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-09-07\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.42\",\"resName\":\"PG-AA-10-01 应急照明（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.43\",\"resName\":\"PG-AA-10-02 消防控制室\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.44\",\"resName\":\"PG-AA-10-03 保安室、大门口用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.45\",\"resName\":\"PG-AA-10-04 货梯（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.46\",\"resName\":\"PG-AA-10-05 消防电梯（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.47\",\"resName\":\"PG-AA-10-06 消防风机（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.48\",\"resName\":\"PG-AA-10-07 生活水泵（主）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-07\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.49\",\"resName\":\"PG-AA-10-08 机房列头柜B路\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-08\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.50\",\"resName\":\"PG-AA-10-09 10#、11#楼地下室照明\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-10-09\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.51\",\"resName\":\"PG-AA-05-01 应急照明（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.52\",\"resName\":\"PG-AA-05-02 消防控制室（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.53\",\"resName\":\"PG-AA-05-03 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.54\",\"resName\":\"PG-AA-05-04 货梯（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.55\",\"resName\":\"PG-AA-05-05 消防电梯（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.56\",\"resName\":\"PG-AA-05-06 消防风机（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.57\",\"resName\":\"PG-AA-05-07 生活水泵（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-07\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.58\",\"resName\":\"PG-AA-05-08 普通排风机\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-08\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.59\",\"resName\":\"PG-AA-05-09 文化活动室用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-05-09\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.60\",\"resName\":\"PG-AA-04-01 11#楼用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-04-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.61\",\"resName\":\"PG-AA-04-02 10楼用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-04-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.62\",\"resName\":\"PG-AA-04-03 消防水泵（备）\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-04-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.63\",\"resName\":\"PG-AA-04-04 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-04-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.64\",\"resName\":\"PG-AA-03-01 UPS旁路输入\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.65\",\"resName\":\"PG-AA-03-02 UPS维修旁路\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.66\",\"resName\":\"PG-AA-03-03 员工C栋宿舍用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.67\",\"resName\":\"PG-AA-03-04 员工A2栋宿舍用电\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.68\",\"resName\":\"PG-AA-03-05 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.69\",\"resName\":\"PG-AA-03-06 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.70\",\"resName\":\"PG-AA-03-07 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-03-07\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.71\",\"resName\":\"PG-AA-02-01 1-7层空调内机、照明、插座\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.72\",\"resName\":\"PG-AA-02-02 8-13层空调内机、照明、插座\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-02\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.73\",\"resName\":\"PG-AA-02-03 8-13层空调屋面配电总箱\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-03\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.74\",\"resName\":\"PG-AA-02-04 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-04\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.75\",\"resName\":\"PG-AA-02-05 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-05\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.76\",\"resName\":\"PG-AA-02-06 备用\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-02-06\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.77\",\"resName\":\"PG-AA-C1 电容补偿柜\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-C1\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.78\",\"resName\":\"PG-AA-01 电源进线\",\"location\":\"总部小机房\",\"deviceCode\":\"PG-AA-01\",\"resCategoryCode\":\"IDC_AA\"},{\"resKey\":\"118.10.200.131.172.79\",\"resName\":\"变压器温控仪\",\"location\":\"总部小机房\",\"deviceCode\":\"B1-TR-TC\",\"resCategoryCode\":\"IDC_TC\"},{\"resKey\":\"118.10.200.131.172.80\",\"resName\":\"配电室温湿度01\",\"location\":\"总部配电室\",\"deviceCode\":\"B1-DR-TH01\",\"resCategoryCode\":\"IDC_TH\"},{\"resKey\":\"118.10.200.131.172.81\",\"resName\":\"配电室温湿度02\",\"location\":\"总部配电室\",\"deviceCode\":\"B1-DR-TH02\",\"resCategoryCode\":\"IDC_TH\"}],\"relations\":null,\"message\":null,\"code\":null}";
        String compressed = compress(str);
        System.out.println("compressed(size=" + compressed.length() + "):\n" + compressed);
        String decompressed = decompress(compressed);
        System.out.println("decompress(size=" + str.length() + "):\n" + decompressed);
        System.out.println(str.equals(decompressed));
    }

    /**
     * 压缩字符串
     *
     * @param str 压缩的字符串
     * @return 压缩后的字符串
     */
    public static String compress(String str) {

        if (StringUtil.isEmpty(str)) {
            return str;
        }

        try {
            ByteArrayOutputStream bos = null;
            // 使用默认缓冲区大小创建新的输出流
            GZIPOutputStream os = null;
            byte[] bs = null;
            try {
                bos = new ByteArrayOutputStream();
                os = new GZIPOutputStream(bos);
                // 写入输出流
                os.write(str.getBytes());
                os.close();
                bos.close();
                bs = bos.toByteArray();
                // 通过解码字节将缓冲区内容转换为字符串
                return new String(bs, CHAR_SET_NAME);
            } finally {
                bs = null;
                bos = null;
                os = null;
            }
        } catch (Exception ex) {
            return str;
        }
    }

    /**
     * 解压缩字符串
     *
     * @param str 解压缩的字符串
     * @return 解压后的字符串
     */
    public static String decompress(String str) {

        if (StringUtil.isEmpty(str)) {
            return str;
        }

        ByteArrayInputStream bis = null;
        ByteArrayOutputStream bos = null;
        GZIPInputStream is = null;
        byte[] buf = null;
        try {
            bis = new ByteArrayInputStream(str.getBytes(CHAR_SET_NAME));
            bos = new ByteArrayOutputStream();
            // 使用默认缓冲区大小创建新的输入流
            is = new GZIPInputStream(bis);
            buf = new byte[1024];
            int len = 0;
            // 将未压缩数据读入字节数组
            while ((len = is.read(buf)) != -1) {
                // 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此byte数组输出流
                bos.write(buf, 0, len);
            }
            is.close();
            bis.close();
            bos.close();
            // 通过解码字节将缓冲区内容转换为字符串
            return new String(bos.toByteArray());
        } catch (Exception ex) {
            return str;
        } finally {
            bis = null;
            bos = null;
            is = null;
            buf = null;
        }
    }
}