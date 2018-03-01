/**
 * echart 地市对应的地图数据编号
 */
var aa=null;





var layaa=['50%', '50%'];
var datamap=[
    {name: '重庆市',value: Math.round(Math.random()*1000)},
    {name: '北京市',value: Math.round(Math.random()*1000)},
    {name: '天津市',value: Math.round(Math.random()*1000)},
    {name: '上海市',value: Math.round(Math.random()*1000)},
    {name: '香港',value: Math.round(Math.random()*1000)},
    {name: '澳门',value: Math.round(Math.random()*1000)},
    {name: '巴音郭楞蒙古自治州',value: Math.round(Math.random()*1000)},
    {name: '和田地区',value: Math.round(Math.random()*1000)},
    {name: '哈密地区',value: Math.round(Math.random()*1000)},
    {name: '阿克苏地区',value: Math.round(Math.random()*1000)},
    {name: '阿勒泰地区',value: Math.round(Math.random()*1000)},
    {name: '喀什地区',value: Math.round(Math.random()*1000)},
    {name: '塔城地区',value: Math.round(Math.random()*1000)},
    {name: '昌吉回族自治州',value: Math.round(Math.random()*1000)},
    {name: '克孜勒苏柯尔克孜自治州',value: Math.round(Math.random()*1000)},
    {name: '吐鲁番地区',value: Math.round(Math.random()*1000)},
    {name: '伊犁哈萨克自治州',value: Math.round(Math.random()*1000)},
    {name: '博尔塔拉蒙古自治州',value: Math.round(Math.random()*1000)},
    {name: '乌鲁木齐市',value: Math.round(Math.random()*1000)},
    {name: '克拉玛依市',value: Math.round(Math.random()*1000)},
    {name: '阿拉尔市',value: Math.round(Math.random()*1000)},
    {name: '图木舒克市',value: Math.round(Math.random()*1000)},
    {name: '五家渠市',value: Math.round(Math.random()*1000)},
    {name: '石河子市',value: Math.round(Math.random()*1000)},
    {name: '那曲地区',value: Math.round(Math.random()*1000)},
    {name: '阿里地区',value: Math.round(Math.random()*1000)},
    {name: '日喀则地区',value: Math.round(Math.random()*1000)},
    {name: '林芝地区',value: Math.round(Math.random()*1000)},
    {name: '昌都地区',value: Math.round(Math.random()*1000)},
    {name: '山南地区',value: Math.round(Math.random()*1000)},
    {name: '拉萨市',value: Math.round(Math.random()*1000)},
    {name: '呼伦贝尔市',value: Math.round(Math.random()*1000)},
    {name: '阿拉善盟',value: Math.round(Math.random()*1000)},
    {name: '锡林郭勒盟',value: Math.round(Math.random()*1000)},
    {name: '鄂尔多斯市',value: Math.round(Math.random()*1000)},
    {name: '赤峰市',value: Math.round(Math.random()*1000)},
    {name: '巴彦淖尔市',value: Math.round(Math.random()*1000)},
    {name: '通辽市',value: Math.round(Math.random()*1000)},
    {name: '乌兰察布市',value: Math.round(Math.random()*1000)},
    {name: '兴安盟',value: Math.round(Math.random()*1000)},
    {name: '包头市',value: Math.round(Math.random()*1000)},
    {name: '呼和浩特市',value: Math.round(Math.random()*1000)},
    {name: '乌海市',value: Math.round(Math.random()*1000)},
    {name: '海西蒙古族藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '玉树藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '果洛藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '海南藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '海北藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '黄南藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '海东地区',value: Math.round(Math.random()*1000)},
    {name: '西宁市',value: Math.round(Math.random()*1000)},
    {name: '甘孜藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '阿坝藏族羌族自治州',value: Math.round(Math.random()*1000)},
    {name: '凉山彝族自治州',value: Math.round(Math.random()*1000)},
    {name: '绵阳市',value: Math.round(Math.random()*1000)},
    {name: '达州市',value: Math.round(Math.random()*1000)},
    {name: '广元市',value: Math.round(Math.random()*1000)},
    {name: '雅安市',value: Math.round(Math.random()*1000)},
    {name: '宜宾市',value: Math.round(Math.random()*1000)},
    {name: '乐山市',value: Math.round(Math.random()*1000)},
    {name: '南充市',value: Math.round(Math.random()*1000)},
    {name: '巴中市',value: Math.round(Math.random()*1000)},
    {name: '泸州市',value: Math.round(Math.random()*1000)},
    {name: '成都市',value: Math.round(Math.random()*1000)},
    {name: '资阳市',value: Math.round(Math.random()*1000)},
    {name: '攀枝花市',value: Math.round(Math.random()*1000)},
    {name: '眉山市',value: Math.round(Math.random()*1000)},
    {name: '广安市',value: Math.round(Math.random()*1000)},
    {name: '德阳市',value: Math.round(Math.random()*1000)},
    {name: '内江市',value: Math.round(Math.random()*1000)},
    {name: '遂宁市',value: Math.round(Math.random()*1000)},
    {name: '自贡市',value: Math.round(Math.random()*1000)},
    {name: '黑河市',value: Math.round(Math.random()*1000)},
    {name: '大兴安岭地区',value: Math.round(Math.random()*1000)},
    {name: '哈尔滨市',value: Math.round(Math.random()*1000)},
    {name: '齐齐哈尔市',value: Math.round(Math.random()*1000)},
    {name: '牡丹江市',value: Math.round(Math.random()*1000)},
    {name: '绥化市',value: Math.round(Math.random()*1000)},
    {name: '伊春市',value: Math.round(Math.random()*1000)},
    {name: '佳木斯市',value: Math.round(Math.random()*1000)},
    {name: '鸡西市',value: Math.round(Math.random()*1000)},
    {name: '双鸭山市',value: Math.round(Math.random()*1000)},
    {name: '大庆市',value: Math.round(Math.random()*1000)},
    {name: '鹤岗市',value: Math.round(Math.random()*1000)},
    {name: '七台河市',value: Math.round(Math.random()*1000)},
    {name: '酒泉市',value: Math.round(Math.random()*1000)},
    {name: '张掖市',value: Math.round(Math.random()*1000)},
    {name: '甘南藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '武威市',value: Math.round(Math.random()*1000)},
    {name: '陇南市',value: Math.round(Math.random()*1000)},
    {name: '庆阳市',value: Math.round(Math.random()*1000)},
    {name: '白银市',value: Math.round(Math.random()*1000)},
    {name: '定西市',value: Math.round(Math.random()*1000)},
    {name: '天水市',value: Math.round(Math.random()*1000)},
    {name: '兰州市',value: Math.round(Math.random()*1000)},
    {name: '平凉市',value: Math.round(Math.random()*1000)},
    {name: '临夏回族自治州',value: Math.round(Math.random()*1000)},
    {name: '金昌市',value: Math.round(Math.random()*1000)},
    {name: '嘉峪关市',value: Math.round(Math.random()*1000)},
    {name: '普洱市',value: Math.round(Math.random()*1000)},
    {name: '红河哈尼族彝族自治州',value: Math.round(Math.random()*1000)},
    {name: '文山壮族苗族自治州',value: Math.round(Math.random()*1000)},
    {name: '曲靖市',value: Math.round(Math.random()*1000)},
    {name: '楚雄彝族自治州',value: Math.round(Math.random()*1000)},
    {name: '大理白族自治州',value: Math.round(Math.random()*1000)},
    {name: '临沧市',value: Math.round(Math.random()*1000)},
    {name: '迪庆藏族自治州',value: Math.round(Math.random()*1000)},
    {name: '昭通市',value: Math.round(Math.random()*1000)},
    {name: '昆明市',value: Math.round(Math.random()*1000)},
    {name: '丽江市',value: Math.round(Math.random()*1000)},
    {name: '西双版纳傣族自治州',value: Math.round(Math.random()*1000)},
    {name: '保山市',value: Math.round(Math.random()*1000)},
    {name: '玉溪市',value: Math.round(Math.random()*1000)},
    {name: '怒江傈僳族自治州',value: Math.round(Math.random()*1000)},
    {name: '德宏傣族景颇族自治州',value: Math.round(Math.random()*1000)},
    {name: '百色市',value: Math.round(Math.random()*1000)},
    {name: '河池市',value: Math.round(Math.random()*1000)},
    {name: '桂林市',value: Math.round(Math.random()*1000)},
    {name: '南宁市',value: Math.round(Math.random()*1000)},
    {name: '柳州市',value: Math.round(Math.random()*1000)},
    {name: '崇左市',value: Math.round(Math.random()*1000)},
    {name: '来宾市',value: Math.round(Math.random()*1000)},
    {name: '玉林市',value: Math.round(Math.random()*1000)},
    {name: '梧州市',value: Math.round(Math.random()*1000)},
    {name: '贺州市',value: Math.round(Math.random()*1000)},
    {name: '钦州市',value: Math.round(Math.random()*1000)},
    {name: '贵港市',value: Math.round(Math.random()*1000)},
    {name: '防城港市',value: Math.round(Math.random()*1000)},
    {name: '北海市',value: Math.round(Math.random()*1000)},
    {name: '怀化市',value: Math.round(Math.random()*1000)},
    {name: '永州市',value: Math.round(Math.random()*1000)},
    {name: '邵阳市',value: Math.round(Math.random()*1000)},
    {name: '郴州市',value: Math.round(Math.random()*1000)},
    {name: '常德市',value: Math.round(Math.random()*1000)},
    {name: '湘西土家族苗族自治州',value: Math.round(Math.random()*1000)},
    {name: '衡阳市',value: Math.round(Math.random()*1000)},
    {name: '岳阳市',value: Math.round(Math.random()*1000)},
    {name: '益阳市',value: Math.round(Math.random()*1000)},
    {name: '长沙市',value: Math.round(Math.random()*1000)},
    {name: '株洲市',value: Math.round(Math.random()*1000)},
    {name: '张家界市',value: Math.round(Math.random()*1000)},
    {name: '娄底市',value: Math.round(Math.random()*1000)},
    {name: '湘潭市',value: Math.round(Math.random()*1000)},
    {name: '榆林市',value: Math.round(Math.random()*1000)},
    {name: '延安市',value: Math.round(Math.random()*1000)},
    {name: '汉中市',value: Math.round(Math.random()*1000)},
    {name: '安康市',value: Math.round(Math.random()*1000)},
    {name: '商洛市',value: Math.round(Math.random()*1000)},
    {name: '宝鸡市',value: Math.round(Math.random()*1000)},
    {name: '渭南市',value: Math.round(Math.random()*1000)},
    {name: '咸阳市',value: Math.round(Math.random()*1000)},
    {name: '西安市',value: Math.round(Math.random()*1000)},
    {name: '铜川市',value: Math.round(Math.random()*1000)},
    {name: '清远市',value: Math.round(Math.random()*1000)},
    {name: '韶关市',value: Math.round(Math.random()*1000)},
    {name: '湛江市',value: Math.round(Math.random()*1000)},
    {name: '梅州市',value: Math.round(Math.random()*1000)},
    {name: '河源市',value: Math.round(Math.random()*1000)},
    {name: '肇庆市',value: Math.round(Math.random()*1000)},
    {name: '惠州市',value: Math.round(Math.random()*1000)},
    {name: '茂名市',value: Math.round(Math.random()*1000)},
    {name: '江门市',value: Math.round(Math.random()*1000)},
    {name: '阳江市',value: Math.round(Math.random()*1000)},
    {name: '云浮市',value: Math.round(Math.random()*1000)},
    {name: '广州市',value: Math.round(Math.random()*1000)},
    {name: '汕尾市',value: Math.round(Math.random()*1000)},
    {name: '揭阳市',value: Math.round(Math.random()*1000)},
    {name: '珠海市',value: Math.round(Math.random()*1000)},
    {name: '佛山市',value: Math.round(Math.random()*1000)},
    {name: '潮州市',value: Math.round(Math.random()*1000)},
    {name: '汕头市',value: Math.round(Math.random()*1000)},
    {name: '深圳市',value: Math.round(Math.random()*1000)},
    {name: '东莞市',value: Math.round(Math.random()*1000)},
    {name: '中山市',value: Math.round(Math.random()*1000)},
    {name: '延边朝鲜族自治州',value: Math.round(Math.random()*1000)},
    {name: '吉林市',value: Math.round(Math.random()*1000)},
    {name: '白城市',value: Math.round(Math.random()*1000)},
    {name: '松原市',value: Math.round(Math.random()*1000)},
    {name: '长春市',value: Math.round(Math.random()*1000)},
    {name: '白山市',value: Math.round(Math.random()*1000)},
    {name: '通化市',value: Math.round(Math.random()*1000)},
    {name: '四平市',value: Math.round(Math.random()*1000)},
    {name: '辽源市',value: Math.round(Math.random()*1000)},
    {name: '承德市',value: Math.round(Math.random()*1000)},
    {name: '张家口市',value: Math.round(Math.random()*1000)},
    {name: '保定市',value: Math.round(Math.random()*1000)},
    {name: '唐山市',value: Math.round(Math.random()*1000)},
    {name: '沧州市',value: Math.round(Math.random()*1000)},
    {name: '石家庄市',value: Math.round(Math.random()*1000)},
    {name: '邢台市',value: Math.round(Math.random()*1000)},
    {name: '邯郸市',value: Math.round(Math.random()*1000)},
    {name: '秦皇岛市',value: Math.round(Math.random()*1000)},
    {name: '衡水市',value: Math.round(Math.random()*1000)},
    {name: '廊坊市',value: Math.round(Math.random()*1000)},
    {name: '恩施土家族苗族自治州',value: Math.round(Math.random()*1000)},
    {name: '十堰市',value: Math.round(Math.random()*1000)},
    {name: '宜昌市',value: Math.round(Math.random()*1000)},
    {name: '襄樊市',value: Math.round(Math.random()*1000)},
    {name: '黄冈市',value: Math.round(Math.random()*1000)},
    {name: '荆州市',value: Math.round(Math.random()*1000)},
    {name: '荆门市',value: Math.round(Math.random()*1000)},
    {name: '咸宁市',value: Math.round(Math.random()*1000)},
    {name: '随州市',value: Math.round(Math.random()*1000)},
    {name: '孝感市',value: Math.round(Math.random()*1000)},
    {name: '武汉市',value: Math.round(Math.random()*1000)},
    {name: '黄石市',value: Math.round(Math.random()*1000)},
    {name: '神农架林区',value: Math.round(Math.random()*1000)},
    {name: '天门市',value: Math.round(Math.random()*1000)},
    {name: '仙桃市',value: Math.round(Math.random()*1000)},
    {name: '潜江市',value: Math.round(Math.random()*1000)},
    {name: '鄂州市',value: Math.round(Math.random()*1000)},
    {name: '遵义市',value: Math.round(Math.random()*1000)},
    {name: '黔东南苗族侗族自治州',value: Math.round(Math.random()*1000)},
    {name: '毕节地区',value: Math.round(Math.random()*1000)},
    {name: '黔南布依族苗族自治州',value: Math.round(Math.random()*1000)},
    {name: '铜仁地区',value: Math.round(Math.random()*1000)},
    {name: '黔西南布依族苗族自治州',value: Math.round(Math.random()*1000)},
    {name: '六盘水市',value: Math.round(Math.random()*1000)},
    {name: '安顺市',value: Math.round(Math.random()*1000)},
    {name: '贵阳市',value: Math.round(Math.random()*1000)},
    {name: '烟台市',value: Math.round(Math.random()*1000)},
    {name: '临沂市',value: Math.round(Math.random()*1000)},
    {name: '潍坊市',value: Math.round(Math.random()*1000)},
    {name: '青岛市',value: Math.round(Math.random()*1000)},
    {name: '菏泽市',value: Math.round(Math.random()*1000)},
    {name: '济宁市',value: Math.round(Math.random()*1000)},
    {name: '德州市',value: Math.round(Math.random()*1000)},
    {name: '滨州市',value: Math.round(Math.random()*1000)},
    {name: '聊城市',value: Math.round(Math.random()*1000)},
    {name: '东营市',value: Math.round(Math.random()*1000)},
    {name: '济南市',value: Math.round(Math.random()*1000)},
    {name: '泰安市',value: Math.round(Math.random()*1000)},
    {name: '威海市',value: Math.round(Math.random()*1000)},
    {name: '日照市',value: Math.round(Math.random()*1000)},
    {name: '淄博市',value: Math.round(Math.random()*1000)},
    {name: '枣庄市',value: Math.round(Math.random()*1000)},
    {name: '莱芜市',value: Math.round(Math.random()*1000)},
    {name: '赣州市',value: Math.round(Math.random()*1000)},
    {name: '吉安市',value: Math.round(Math.random()*1000)},
    {name: '上饶市',value: Math.round(Math.random()*1000)},
    {name: '九江市',value: Math.round(Math.random()*1000)},
    {name: '抚州市',value: Math.round(Math.random()*1000)},
    {name: '宜春市',value: Math.round(Math.random()*1000)},
    {name: '南昌市',value: Math.round(Math.random()*1000)},
    {name: '景德镇市',value: Math.round(Math.random()*1000)},
    {name: '萍乡市',value: Math.round(Math.random()*1000)},
    {name: '鹰潭市',value: Math.round(Math.random()*1000)},
    {name: '新余市',value: Math.round(Math.random()*1000)},
    {name: '南阳市',value: Math.round(Math.random()*1000)},
    {name: '信阳市',value: Math.round(Math.random()*1000)},
    {name: '洛阳市',value: Math.round(Math.random()*1000)},
    {name: '驻马店市',value: Math.round(Math.random()*1000)},
    {name: '周口市',value: Math.round(Math.random()*1000)},
    {name: '商丘市',value: Math.round(Math.random()*1000)},
    {name: '三门峡市',value: Math.round(Math.random()*1000)},
    {name: '新乡市',value: Math.round(Math.random()*1000)},
    {name: '平顶山市',value: Math.round(Math.random()*1000)},
    {name: '郑州市',value: Math.round(Math.random()*1000)},
    {name: '安阳市',value: Math.round(Math.random()*1000)},
    {name: '开封市',value: Math.round(Math.random()*1000)},
    {name: '焦作市',value: Math.round(Math.random()*1000)},
    {name: '许昌市',value: Math.round(Math.random()*1000)},
    {name: '濮阳市',value: Math.round(Math.random()*1000)},
    {name: '漯河市',value: Math.round(Math.random()*1000)},
    {name: '鹤壁市',value: Math.round(Math.random()*1000)},
    {name: '大连市',value: Math.round(Math.random()*1000)},
    {name: '朝阳市',value: Math.round(Math.random()*1000)},
    {name: '丹东市',value: Math.round(Math.random()*1000)},
    {name: '铁岭市',value: Math.round(Math.random()*1000)},
    {name: '沈阳市',value: Math.round(Math.random()*1000)},
    {name: '抚顺市',value: Math.round(Math.random()*1000)},
    {name: '葫芦岛市',value: Math.round(Math.random()*1000)},
    {name: '阜新市',value: Math.round(Math.random()*1000)},
    {name: '锦州市',value: Math.round(Math.random()*1000)},
    {name: '鞍山市',value: Math.round(Math.random()*1000)},
    {name: '本溪市',value: Math.round(Math.random()*1000)},
    {name: '营口市',value: Math.round(Math.random()*1000)},
    {name: '辽阳市',value: Math.round(Math.random()*1000)},
    {name: '盘锦市',value: Math.round(Math.random()*1000)},
    {name: '忻州市',value: Math.round(Math.random()*1000)},
    {name: '吕梁市',value: Math.round(Math.random()*1000)},
    {name: '临汾市',value: Math.round(Math.random()*1000)},
    {name: '晋中市',value: Math.round(Math.random()*1000)},
    {name: '运城市',value: Math.round(Math.random()*1000)},
    {name: '大同市',value: Math.round(Math.random()*1000)},
    {name: '长治市',value: Math.round(Math.random()*1000)},
    {name: '朔州市',value: Math.round(Math.random()*1000)},
    {name: '晋城市',value: Math.round(Math.random()*1000)},
    {name: '太原市',value: Math.round(Math.random()*1000)},
    {name: '阳泉市',value: Math.round(Math.random()*1000)},
    {name: '六安市',value: Math.round(Math.random()*1000)},
    {name: '安庆市',value: Math.round(Math.random()*1000)},
    {name: '滁州市',value: Math.round(Math.random()*1000)},
    {name: '宣城市',value: Math.round(Math.random()*1000)},
    {name: '阜阳市',value: Math.round(Math.random()*1000)},
    {name: '宿州市',value: Math.round(Math.random()*1000)},
    {name: '黄山市',value: Math.round(Math.random()*1000)},
    {name: '巢湖市',value: Math.round(Math.random()*1000)},
    {name: '亳州市',value: Math.round(Math.random()*1000)},
    {name: '池州市',value: Math.round(Math.random()*1000)},
    {name: '合肥市',value: Math.round(Math.random()*1000)},
    {name: '蚌埠市',value: Math.round(Math.random()*1000)},
    {name: '芜湖市',value: Math.round(Math.random()*1000)},
    {name: '淮北市',value: Math.round(Math.random()*1000)},
    {name: '淮南市',value: Math.round(Math.random()*1000)},
    {name: '马鞍山市',value: Math.round(Math.random()*1000)},
    {name: '铜陵市',value: Math.round(Math.random()*1000)},
    {name: '南平市',value: Math.round(Math.random()*1000)},
    {name: '三明市',value: Math.round(Math.random()*1000)},
    {name: '龙岩市',value: Math.round(Math.random()*1000)},
    {name: '宁德市',value: Math.round(Math.random()*1000)},
    {name: '福州市',value: Math.round(Math.random()*1000)},
    {name: '漳州市',value: Math.round(Math.random()*1000)},
    {name: '泉州市',value: Math.round(Math.random()*1000)},
    {name: '莆田市',value: Math.round(Math.random()*1000)},
    {name: '厦门市',value: Math.round(Math.random()*1000)},
    {name: '丽水市',value: Math.round(Math.random()*1000)},
    {name: '杭州市',value: Math.round(Math.random()*1000)},
    {name: '温州市',value: Math.round(Math.random()*1000)},
    {name: '宁波市',value: Math.round(Math.random()*1000)},
    {name: '舟山市',value: Math.round(Math.random()*1000)},
    {name: '台州市',value: Math.round(Math.random()*1000)},
    {name: '金华市',value: Math.round(Math.random()*1000)},
    {name: '衢州市',value: Math.round(Math.random()*1000)},
    {name: '绍兴市',value: Math.round(Math.random()*1000)},
    {name: '嘉兴市',value: Math.round(Math.random()*1000)},
    {name: '湖州市',value: Math.round(Math.random()*1000)},
    {name: '盐城市',value: Math.round(Math.random()*1000)},
    {name: '徐州市',value: Math.round(Math.random()*1000)},
    {name: '南通市',value: Math.round(Math.random()*1000)},
    {name: '淮安市',value: Math.round(Math.random()*1000)},
    {name: '苏州市',value: Math.round(Math.random()*1000)},
    {name: '宿迁市',value: Math.round(Math.random()*1000)},
    {name: '连云港市',value: Math.round(Math.random()*1000)},
    {name: '扬州市',value: Math.round(Math.random()*1000)},
    {name: '南京市',value: Math.round(Math.random()*1000)},
    {name: '泰州市',value: Math.round(Math.random()*1000)},
    {name: '无锡市',value: Math.round(Math.random()*1000)},
    {name: '常州市',value: Math.round(Math.random()*1000)},
    {name: '镇江市',value: Math.round(Math.random()*1000)},
    {name: '吴忠市',value: Math.round(Math.random()*1000)},
    {name: '中卫市',value: Math.round(Math.random()*1000)},
    {name: '固原市',value: Math.round(Math.random()*1000)},
    {name: '银川市',value: Math.round(Math.random()*1000)},
    {name: '石嘴山市',value: Math.round(Math.random()*1000)},
    {name: '儋州市',value: Math.round(Math.random()*1000)},
    {name: '文昌市',value: Math.round(Math.random()*1000)},
    {name: '乐东黎族自治县',value: Math.round(Math.random()*1000)},
    {name: '三亚市',value: Math.round(Math.random()*1000)},
    {name: '琼中黎族苗族自治县',value: Math.round(Math.random()*1000)},
    {name: '东方市',value: Math.round(Math.random()*1000)},
    {name: '海口市',value: Math.round(Math.random()*1000)},
    {name: '万宁市',value: Math.round(Math.random()*1000)},
    {name: '澄迈县',value: Math.round(Math.random()*1000)},
    {name: '白沙黎族自治县',value: Math.round(Math.random()*1000)},
    {name: '琼海市',value: Math.round(Math.random()*1000)},
    {name: '昌江黎族自治县',value: Math.round(Math.random()*1000)},
    {name: '临高县',value: Math.round(Math.random()*1000)},
    {name: '陵水黎族自治县',value: Math.round(Math.random()*1000)},
    {name: '屯昌县',value: Math.round(Math.random()*1000)},
    {name: '定安县',value: Math.round(Math.random()*1000)},
    {name: '保亭黎族苗族自治县',value: Math.round(Math.random()*1000)},
    {name: '五指山市',value: Math.round(Math.random()*1000)}
]






var emProvance={
    "澳门":"aomen",
    "北京":"beijing",
    "重庆":"chongqing",
    "四川":"sichuan",
    "湖北":"hubei",
    "湖南":"hunan",
    "广东":"guangdong",
    "新疆":"xinjiang",
    "安徽":"anhui",
    "福建":"fujian",
    "甘肃":"gansu",
    "广西":"guangxi",
    "贵州":"guizhou",
    "海南":"hainan",
    "河北":"hebei",
    "黑龙江":"heilongjiang",
    "河南":"henan",
    "江苏":"jiangsu",

    "江西":"jiangxi",
    "吉林":"jilin",
    "辽宁":"liaoning",
    "内蒙古":"neimenggu",
    "宁夏":"ningxia",
    "青海":"qinghai",

    "山东":"shandong",
    "上海":"shanghai",
    "山西":"shanxi",
    "陕西":"shaanxi",
    "台湾":"taiwan",
    "天津":"tianjin",
    "香港":"xianggang",
    "西藏":"xizang",
    "云南":"yunnan",
    "浙江":"zhejiang"


}
var echartMapCode = {
    "合肥": "340100",
    "芜湖": "340200",
    "蚌埠": "340300",
    "淮南": "340400",
    "马鞍山": "340500",
    "淮北": "340600",
    "铜陵": "340700",
    "安庆": "340800",
    "黄山": "341000",
    "滁州": "341100",
    "阜阳": "341200",
    "宿州": "341300",
    "六安": "341500",
    "亳州": "341600",
    "池州": "341700",
    "宣城": "341800",
    "福州": "350100",
    "厦门": "350200",
    "莆田": "350300",
    "三明": "350400",
    "泉州": "350500",
    "漳州": "350600",
    "南平": "350700",
    "龙岩": "350800",
    "宁德": "350900",
    "兰州": "620100",
    "嘉峪关": "620200",
    "金昌": "620300",
    "白银": "620400",
    "天水": "620500",
    "武威": "620600",
    "张掖": "620700",
    "平凉": "620800",
    "酒泉": "620900",
    "庆阳": "621000",
    "定西": "621100",
    "陇南": "621200",
    "临夏": "622900",
    "甘南": "623000",
    "广州": "440100",
    "韶关": "440200",
    "深圳": "440300",
    "珠海": "440400",
    "汕头": "440500",
    "佛山": "440600",
    "江门": "440700",
    "湛江": "440800",
    "茂名": "440900",
    "肇庆": "441200",
    "惠州": "441300",
    "梅州": "441400",
    "汕尾": "441500",
    "河源": "441600",
    "阳江": "441700",
    "清远": "441800",
    "东莞": "441900",
    "中山": "442000",
    "潮州": "445100",
    "揭阳": "445200",
    "云浮": "445300",
    "南宁": "450100",
    "柳州": "450200",
    "桂林": "450300",
    "梧州": "450400",
    "北海": "450500",
    "防城港": "450600",
    "钦州": "450700",
    "贵港": "450800",
    "玉林": "450900",
    "百色": "451000",
    "贺州": "451100",
    "河池": "451200",
    "来宾": "451300",
    "崇左": "451400",
    "贵阳": "520100",
    "六盘水": "520200",
    "遵义": "520300",
    "安顺": "520400",
    "铜仁": "520600",
    "黔西南": "522300",
    "毕节": "520500",
    "黔东南": "522600",
    "黔南": "522700",
    "海口": "460100",
    "三亚": "460200",
    "五指山": "469001",
    "琼海": "469002",
    "儋州": "469003",
    "文昌": "469005",
    "万宁": "469006",
    "东方": "469007",
    "定安县": "469021",
    "屯昌县": "469022",
    "澄迈县": "469023",
    "临高县": "469024",
    "白沙": "469025",
    "昌江": "469026",
    "乐东": "469027",
    "陵水": "469028",
    "保亭": "469029",
    "琼中": "469030",
    "石家庄": "130100",
    "唐山": "130200",
    "秦皇岛": "130300",
    "邯郸": "130400",
    "邢台": "130500",
    "保定": "130600",
    "张家口": "130700",
    "承德": "130800",
    "沧州": "130900",
    "廊坊": "131000",
    "衡水": "131100",
    "哈尔滨": "230100",
    "齐齐哈尔": "230200",
    "鸡西": "230300",
    "鹤岗": "230400",
    "双鸭山": "230500",
    "大庆": "230600",
    "伊春": "230700",
    "佳木斯": "230800",
    "七台河": "230900",
    "牡丹江": "231000",
    "黑河": "231100",
    "绥化": "231200",
    "大兴安岭": "232700",
    "郑州": "410100",
    "开封": "410200",
    "洛阳": "410300",
    "平顶山": "410400",
    "安阳": "410500",
    "鹤壁": "410600",
    "新乡": "410700",
    "焦作": "410800",
    "濮阳": "410900",
    "许昌": "411000",
    "漯河": "411100",
    "三门峡": "411200",
    "南阳": "411300",
    "商丘": "411400",
    "信阳": "411500",
    "周口": "411600",
    "驻马店": "411700",
    "济源": "419001",
    "武汉": "420100",
    "黄石": "420200",
    "十堰": "420300",
    "宜昌": "420500",
    "襄阳": "420600",
    "鄂州": "420700",
    "荆门": "420800",
    "孝感": "420900",
    "荆州": "421000",
    "黄冈": "421100",
    "咸宁": "421200",
    "随州": "421300",
    "恩施": "422800",
    "仙桃": "429004",
    "潜江": "429005",
    "天门": "429006",
    "神农架": "429021",
    "长沙": "430100",
    "株洲": "430200",
    "湘潭": "430300",
    "衡阳": "430400",
    "邵阳": "430500",
    "岳阳": "430600",
    "常德": "430700",
    "张家界": "430800",
    "益阳": "430900",
    "郴州": "431000",
    "永州": "431100",
    "怀化": "431200",
    "娄底": "431300",
    "湘西": "433100",
    "南京": "320100",
    "无锡": "320200",
    "徐州": "320300",
    "常州": "320400",
    "苏州": "320500",
    "南通": "320600",
    "连云港": "320700",
    "淮安": "320800",
    "盐城": "320900",
    "扬州": "321000",
    "镇江": "321100",
    "泰州": "321200",
    "宿迁": "321300",
    "南昌": "360100",
    "景德镇": "360200",
    "萍乡": "360300",
    "九江": "360400",
    "新余": "360500",
    "鹰潭": "360600",
    "赣州": "360700",
    "吉安": "360800",
    "宜春": "360900",
    "抚州": "361000",
    "上饶": "361100",
    "长春": "220100",
    "吉林": "220200",
    "四平": "220300",
    "辽源": "220400",
    "通化": "220500",
    "白山": "220600",
    "松原": "220700",
    "白城": "220800",
    "延边": "222400",
    "沈阳": "210100",
    "大连": "210200",
    "鞍山": "210300",
    "抚顺": "210400",
    "本溪": "210500",
    "丹东": "210600",
    "锦州": "210700",
    "营口": "210800",
    "阜新": "210900",
    "辽阳": "211000",
    "盘锦": "211100",
    "铁岭": "211200",
    "朝阳": "211300",
    "葫芦岛": "211400",
    "呼和浩特": "150100",
    "包头": "150200",
    "乌海": "150300",
    "赤峰": "150400",
    "通辽": "150500",
    "鄂尔多斯": "150600",
    "呼伦贝尔": "150700",
    "巴彦淖尔": "150800",
    "乌兰察布": "150900",
    "兴安盟": "152200",
    "锡林郭勒盟": "152500",
    "阿拉善盟": "152900",
    "银川": "640100",
    "石嘴山": "640200",
    "吴忠": "640300",
    "固原": "640400",
    "中卫": "640500",
    "西宁": "630100",
    "海东": "630200",
    "海北": "632200",
    "黄南": "632300",
    "海南": "632500",
    "果洛": "632600",
    "玉树": "632700",
    "海西": "632800",
    "济南": "370100",
    "青岛": "370200",
    "淄博": "370300",
    "枣庄": "370400",
    "东营": "370500",
    "烟台": "370600",
    "潍坊": "370700",
    "济宁": "370800",
    "泰安": "370900",
    "威海": "371000",
    "日照": "371100",
    "莱芜": "371200",
    "临沂": "371300",
    "德州": "371400",
    "聊城": "371500",
    "滨州": "371600",
    "菏泽": "371700",
    "太原": "140100",
    "大同": "140200",
    "阳泉": "140300",
    "长治": "140400",
    "晋城": "140500",
    "朔州": "140600",
    "晋中": "140700",
    "运城": "140800",
    "忻州": "140900",
    "临汾": "141000",
    "吕梁": "141100",
    "西安": "610100",
    "铜川": "610200",
    "宝鸡": "610300",
    "咸阳": "610400",
    "渭南": "610500",
    "延安": "610600",
    "汉中": "610700",
    "榆林": "610800",
    "安康": "610900",
    "商洛": "611000",
    "成都": "510100",
    "自贡": "510300",
    "攀枝花": "510400",
    "泸州": "510500",
    "德阳": "510600",
    "绵阳": "510700",
    "广元": "510800",
    "遂宁": "510900",
    "内江": "511000",
    "乐山": "511100",
    "南充": "511300",
    "眉山": "511400",
    "宜宾": "511500",
    "广安": "511600",
    "达州": "511700",
    "雅安": "511800",
    "巴中": "511900",
    "资阳": "512000",
    "阿坝": "513200",
    "甘孜": "513300",
    "凉山": "513400",
    "乌鲁木齐": "650100",
    "克拉玛依": "650200",
    "吐鲁番": "652100",
    "哈密": "652200",
    "昌吉": "652300",
    "博尔塔拉": "652700",
    "巴音郭楞": "652800",
    "阿克苏": "652900",
    "克孜勒苏": "653000",
    "喀什": "653100",
    "和田": "653200",
    "伊犁": "654000",
    "塔城": "654200",
    "阿勒泰": "654300",
    "石河子": "659001",
    "阿拉尔": "659002",
    "图木舒克": "659003",
    "五家渠": "659004",
    "北屯": "659005",
    "铁门关": "659006",
    "双河": "659007",
    "拉萨": "540100",
    "昌都": "540300",
    "山南": "542200",
    "日喀则": "540200",
    "那曲": "542400",
    "阿里": "542500",
    "林芝": "542600",
    "昆明": "530100",
    "曲靖": "530300",
    "玉溪": "530400",
    "保山": "530500",
    "昭通": "530600",
    "丽江": "530700",
    "普洱": "530800",
    "临沧": "530900",
    "楚雄": "532300",
    "红河": "532500",
    "文山": "532600",
    "西双版纳": "532800",
    "大理": "532900",
    "德宏": "533100",
    "怒江": "533300",
    "迪庆": "533400",
    "杭州": "330100",
    "宁波": "330200",
    "温州": "330300",
    "嘉兴": "330400",
    "湖州": "330500",
    "绍兴": "330600",
    "金华": "330700",
    "衢州": "330800",
    "舟山": "330900",
    "台州": "331000",
    "丽水": "331100",
    "台湾": "710000",
    "北京": "110000",
    "天津": "120000",
    "上海": "310000",
    "重庆": "500000",
    "香港": "810000",
    "澳门": "820000"
}

/**
 * 时间处理方法
 * @type {{getWdatePicker: wdataPicker.getWdatePicker, timByTypeConvert: wdataPicker.timByTypeConvert}}
 */
var wdataPicker = {
    getWdatePicker: function (timTyp, pickedCallBack) {
        var args = {
            onpicked: function () {
                var o = $dp.cal.newdate;
                var d = new Date();
                d.setTime(0);
                d.setFullYear(o.y);
                d.setMonth(o.M - 1);
                d.setDate(o.d);
                d.setHours(o.H);
                d.setMinutes(o.m);
                d.setSeconds(o.s);
                var pattern="yyyyMMdd";
                if (timTyp == "Hour") {
                    pattern="yyyyMMddHH";
                } else if (timTyp == "QuarterHour") {
                     pattern="yyyyMMddHHmm";
                }

                $(this).attr("hidVal", d.pattern(pattern));
                this.blur();

                if (typeof(pickedCallBack) == "function") {
                    pickedCallBack(d.pattern(pattern));
                }
            },
            maxDate: '%y-%M-{%d}',
            startDate: '%y-%M-{%d-1}',
            dateFmt: 'yyyy-MM-dd',
            readOnly: true,
            isShowOK: false,
            isShowClear: false,
            firstDayOfWeek: 1,
            isShowToday: false,
            isShowWeek: false
        };

        switch (timTyp) {
            case "Hour":
                args.maxDate = '%y-%M-%d {%H}';
                args.startDate = '%y-%M-%d {%H-1}';
                args.dateFmt = 'yyyy-MM-dd HH';
                args.isShowOK = true;
                break;
            case "Day":
                args.maxDate = '%y-%M-{%d}';
                args.startDate = '%y-%M-{%d-1}';
                args.dateFmt = 'yyyy-MM-dd';
                break;
            case "Week":
                args.maxDate = '%y-%M-{%d}';
                args.startDate = '%y-%M-{%d-7}';
                args.dateFmt = 'yyyy-MM-dd';
                args.isShowWeek = true;
                break;
            case "Month":
                args.dateFmt = 'yyyy-MM';
                args.maxDate = '%y-{%M}-01';
                args.startDate = '%y-{%M-1}-01';
                break;
            case "QuarterHour":
                args.maxDate = '%y-%M-%d %H:{%m}';
                args.startDate = '%y-%M-%d %H:00';
                args.dateFmt = 'yyyy-MM-dd HH:mm';
                args.isShowOK = true;
                break;
        }

        return WdatePicker(args);
    },
    getWdatePickerBindSplit: function (ShowId, timTyp) {
        var args = {
            onpicked: function () {
                var o = $dp.cal.newdate;
                var d = new Date();
                d.setTime(0);
                d.setFullYear(o.y);
                d.setMonth(o.M - 1);
                d.setDate(o.d);
                d.setHours(o.H);
                d.setMinutes(o.m);
                d.setSeconds(o.s);
                if (timTyp == "Hour") {
                    $(this).attr("hidVal", d.pattern("yyyyMMddHH"));
                } else if (timTyp == "QuarterHour") {
                    $(this).attr("hidVal", d.pattern("yyyyMMddHHmm"));
                } else {
                    $(this).attr("hidVal", d.pattern("yyyyMMdd"));
                }
                switch (timTyp) {
                    case "Hour":
                        $("#" + ShowId).html("当前选择时间：" + $(this).val() + "&nbsp;&nbsp;共一小时数据");
                        break;
                    case "Day":
                        $("#" + ShowId).html("当前选择时间：" + $(this).val() + "&nbsp;&nbsp;共一天数据");
                        break;
                    case "Week":
                        /*//将选择的时间自动改为最近的前一个周一
                         var theDay = $dp.cal.getDateStr("yyyy/MM/dd");
                         var today = new Date(theDay);
                         var v_days = today.getDay();
                         if(v_days==0){
                         v_days = 7;
                         }
                         today.setDate(today.getDate()+1-v_days);
                         $(this).attr("hidVal", today.pattern("yyyyMMdd"));
                         $(this).val(today.pattern("yyyy年MM月dd日"));
                         */
                        $("#" + ShowId).html("当前选择时间：" + $(this).val() + "&nbsp;&nbsp;共一周数据");
                        break;
                    case "Month":
                        $("#" + ShowId).html("当前选择时间：" + $(this).val() + "&nbsp;&nbsp;共一月数据");
                        break;
                }
                this.blur();
            },
            maxDate: '%y-%M-{%d}',
            startDate: '%y-%M-{%d-1}',
            dateFmt: 'yyyy年MM月dd日',
            readOnly: true,
            isShowClear: false,
            firstDayOfWeek: 1,
            isShowToday: false,
            isShowWeek: false
        };

        switch (timTyp) {
            case "Hour":
                args.maxDate = '%y-%M-%d {%H}';
                args.startDate = '%y-%M-%d {%H-1}';
                args.dateFmt = 'yyyy年MM月dd日HH点';
                break;
            case "Day":
                args.maxDate = '%y-%M-{%d-1}';
                args.startDate = '%y-%M-{%d-1}';
                args.dateFmt = 'yyyy年MM月dd日';
                break;
            case "Week":
                args.maxDate = '%y-%M-{%d}';
                args.startDate = '%y-%M-{%d-7}';
                args.dateFmt = 'yyyy年MM月dd日';
                args.isShowWeek = true;
                break;
            case "Month":
                args.dateFmt = 'yyyy年MM月';
                args.maxDate = '%y-{%M}-01';
                args.startDate = '%y-{%M-1}-01';
                break;
        }
        return WdatePicker(args);
    },

    timByTypeConvert: function (timTyp, tim) {
        var timshow = undefined;
        var day_tim = tim.substr(0, 8);

        var c_d = new Date();
        var convert_d = new Date();
        convert_d.setDate(Number(day_tim.substr(6, 2)));
        convert_d.setYear(Number(day_tim.substr(0, 4)));
        convert_d.setMonth(Number(day_tim.substr(4, 2)) - 1);

        if (tim.length > 8) {
            convert_d.setHours(Number(tim.substr(8, 2)));
        }

        if (tim.length > 10) {
            convert_d.setMinutes(Number(tim.substr(10, 2)));
        }

        switch (timTyp) {
            case "Hour":
                timshow = convert_d.pattern("yyyy-MM-dd HH");
                break;
            case "Day":
                timshow = convert_d.pattern("yyyy-MM-dd");
                break;
            case "Week":
                c_d.setDate(c_d.getDate() - 7);
                if (c_d.pattern('yyyyMMdd') < convert_d.pattern('yyyyMMdd'))
                    convert_d.setDate(convert_d.pattern("dd") - 7);
                convert_d.setDate(convert_d.getDate() - (convert_d.getDay() + 6) % 7);
                timshow = convert_d.pattern("yyyy-MM-dd");
                break;
            case "Month":
                convert_d.setDate(1);
                if (c_d.pattern('yyyyMM') <= convert_d.pattern('yyyyMM')) {
                    convert_d.setMonth(Number(day_tim.substr(4, 2)) - 2);
                }
                timshow = convert_d.pattern("yyyy-MM");
                break;
            case "Quarter":
                var quarter = '一';
                tim = day_tim.substr(0, 4) + '0101';
                var month = c_d.getMonth() + 1;
                month = month - (month + 2) % 3;
                if (convert_d.getFullYear() >= c_d.getFullYear() &&
                    convert_d.getMonth() + 1 >= month) {
                    convert_d.setMonth(Number(convert_d.pattern("MM")) - 4);
                }

                if (convert_d.getMonth() > 2 && convert_d.getMonth() <= 5) {
                    quarter = '二';
                    tim = convert_d.getFullYear() + '0401';
                } else if (convert_d.getMonth() > 5 && convert_d.getMonth() <= 8) {
                    quarter = '三';
                    tim = convert_d.getFullYear() + '0701';
                } else if (convert_d.getMonth() > 8 && convert_d.getMonth() <= 11) {
                    quarter = '四';
                    tim = convert_d.getFullYear() + '1001';
                }
                timshow = convert_d.getFullYear() + '年第' + quarter + '季度';
                break;
            case "QuarterHour":
                timshow = convert_d.pattern("yyyy-MM-dd HH:mm");
                break;
        }

        switch (timTyp) {
            case "Hour":
                return {value: convert_d.pattern("yyyyMMddHH"), text: timshow}
            case "Day":
            case "Week":
            case "Month":
                return {value: convert_d.pattern("yyyyMMdd"), text: timshow}
            case "Quarter":
                return {value: tim, text: timshow}
            case "QuarterHour":
                return {value: convert_d.pattern("yyyyMMddHHmm"), text: timshow}
        }

    }
}

//时间类型
function getTimTypById(timdim) {
    var timTyp="Month";
    switch (timdim) {
        case 11:
        case "11":
            timTyp="Hour";
            break;
        case 12:
        case "12":
            timTyp="Day";
            break;
        case 14:
        case "14":
            timTyp="Month";
            break;
    }
    return timTyp;
}

/**
 * 获取环比数据 得到一个数值和是否是整数
 * @param x 当前值
 * @param y 上一个点的值
 */
function getQoQVal(x, y) {
    if (x == undefined || y == undefined || x == "-" || y == "-" || y == 0)
        return {val: "-", isPositive: undefined};
    x = Number(x);
    y = Number(y);
    var val = ((x - y) / y) * 100;
    var isPositive = val != 0 ? val > 0 : undefined;
    return {val: String(Math.abs(val).toFixed(2)).regexpString(".0{2,}", ""), isPositive: isPositive};
}

/**
 * 根据属性值查找出对象所在的地址索引
 * @param list
 * @param val
 * @param filed
 */
function findIndex(list, val, filed) {
    for (var i = 0; i < list.length; i++) {
        if (filed == undefined) {
            if (list[i] == val)
                return i;
        } else {
            if (list[i][filed] == val)
                return i;
        }
    }
}

/**
 * 根据属性值查找出对象
 * @param list
 * @param val
 * @param filed
 */
function findData(list, val, filed) {
    for (var i = 0; i < list.length; i++) {
        if (filed == undefined) {
            if (list[i] == val)
                return list[i];
        } else {
            if (list[i][filed] == val)
                return list[i];
        }
    }
}

var FK = {};
FK.datetype = {
    none: 0,
    second: 1,
    minute: 3,
    quarterHour: 6,
    fiveMinute: 7,
    halfHour: 8,
    detail: 9,
    hour: 11,
    day: 12,
    week: 13,
    month: 14,
    quarter: 15,
    halfYear: 16,
    year: 17
};

var tojsonstr = typeof JSON !== "undefined" ? JSON.stringify : function (obj) {
    if (obj == undefined)
        return "";
    var arr = [];
    $.each(obj, function (key, val) {
        var next = key + ": ";
        next += $.isPlainObject(val) ? printObj(val) : val;
        arr.push(next);
    });
    return "{ " + arr.join(", ") + " }";
};

function closeMask(maskId, showId) {
    var maskId = maskId == null ? "" : maskId;
    var loadingid = showId == null ? maskId + '_loadingid' : showId;

    var mask = $('#' + maskId + "_newMaskDiv");
    var loading = $('#' + loadingid);

    if (loading && !showId) {
        loading.remove();
    }
    else if (loading) {
        loading.addClass('hide');
    }

    if (mask) {
        mask.remove();
    }
}

function openMask(maskId, showId, fixed, textRight) {
    if ($("#" + (maskId == null ? "" : maskId) + "_newMaskDiv").length > 0) {// 判断是否有同名的mask图层
        return;
    }
    else if ($("#_newMaskDiv").length > 0 || $("table[id='helpGuide']").length > 0) {// 判断是否有全屏的mask图层或操作指导
        return;
    }

    var objMask = $("#" + maskId);
    var loadingid = maskId + '_loadingid';
    if (!maskId) {
        objMask = $("body");
        loadingid = '_loadingid';
    }
    else {
        objMask.addClass("rela");
    }

    var w = document.documentElement.clientWidth;
    var h = document.documentElement.clientHeight;
    if (objMask[0] != undefined) {
        if (objMask[0].offsetWidth) {
            w = objMask[0].offsetWidth;
            h = objMask[0].offsetHeight;
        }
    }

    if (!maskId) {
        w = document.documentElement.clientWidth;
        h = document.documentElement.clientHeight;
    }

    var position = "absolute";

    if (fixed)
        position = "fixed";

    if (!showId) {
        var imgsrc = "http://" + document.location.host + webRoot + "/theme/default/img/imgs/loading.gif";
        objMask.append("<div style='left:" + (w - 35) / 2 + "px;top:" + (h - 35) / 2 + "px;background:url(" + imgsrc + ") no-repeat;height:34px;width:34px;position:" + position + ";z-index:2600px;' id='" + loadingid + "'></div>");
    }
    else {
        var objshow = $("#" + showId);
        var leftvalue = (w - objshow.width()) / 2;

        if (textRight)
            leftvalue = w - objshow.width();

        objshow.css("left", +leftvalue).css("top", (h - objshow.height()) / 2).css("position", position).css("z-index", "2600").removeClass("hide");
    }


    // mask图层
    var newMask = document.createElement("div");
    newMask.id = (maskId == null ? "" : maskId) + "_newMaskDiv";
    newMask.style.position = "absolute";
    newMask.style.zIndex = "2500";
    newMask.style.width = w + "px";
    newMask.style.height = h + "px";
    newMask.style.top = "0px";
    newMask.style.left = "0px";
    newMask.style.background = 'transparent';
    //newMask.style.background = '#000'; //"#000";
    newMask.style.filter = "alpha(opacity=30)";
    newMask.style.opacity = "0.05";
    objMask.append(newMask);

    if (fixed == true) {
        $(newMask).css("position", "fixed");
    }
}

function showNoneDataMsg(divid, msg) {
    var div = $("#" + divid);
    div.css("min-height", "80px");
    div.empty();
    if (msg == undefined) msg = "没有数据";
    div.append("<div style='line-height:" + div.height() + "px;width:100%;height:100%;text-align:center'><span style='font-size:30px' class='c999'>" + msg + "</span></div>");
}

function ajax(url, args, successback, async, completeback, datatype) {
    $.ajax({
        url: url,
        type: "post",
        cache: false,
        async: async == undefined ? true : false,
        data: args,
        dataType: datatype == undefined ? "json" : datatype,
        cache: false,
        success: function (json) {
            if (typeof (successback) == "function")
                successback(json, args);
        },
        complete: function (request, status) {
            var sessionStatus = request.getResponseHeader("SESSION_STATUS");
            if (sessionStatus == "TIMEOUT") {
                var returnurl = window.top.location.pathname;
                if (webRoot != "") returnurl = returnurl.replace(webRoot, "");
                window.top.location.href = webRoot + "/login?returnurl=" + encodeURIComponent(returnurl);
            } else {
                if (typeof (completeback) == "function")
                    completeback();
            }
        },
        beforeSend: function () {
        }
    });
}


function expData(args, btnid, url) {
    var d = new Date();
    var expid = 'key_' + newGuid();
    var form = $("<form id='form111' enctype='multipart/form-data'  action='" + url + "'  method='post'></form>");
    var expCSV = $("<input name='expid' type='text' />");
    expCSV[0].value = expid;

    form.append(expCSV);
    $.each(args, function (filed) {
        form.append($("<input name='" + filed + "' type='hidden'/>").val(args[filed]));
    });
    $("body").append(form);
    form.submit();
    form.remove();

    var btnExp = $("#" + btnid);
    var mt = btnExp[0].offsetTop;
    var expmsg = $("<div id='exp_msg' class='fr'></div>")
    btnExp.attr("disabled", "disabled").parent().append(expmsg);
    var imgsrc = "http://" + document.location.host + webRoot + "/theme/default/img/imgs/loading.gif";
    expmsg.html("<img style='height:20px;width:20px;vertical-align:-6px;margin-top: " + mt + "px' title='正在导出，请等待...' class='ml mr' src='" + imgsrc + "' />");
    var ExpCSVState = function () {
        ajax(webRoot + "/getStatus", {expid: expid}, function (json) {
            if (json.status != "complete") {
                setTimeout(ExpCSVState, 1000);
            }
            else {
                expmsg.remove();
                btnExp.removeAttr("disabled");
            }
        }, true);
    }

    ExpCSVState();
}

function getVal(val, defVal) {
    if (val == undefined && defVal == undefined)
        return "-";
    if (val == undefined)
        return defVal;

    return val;
}

function todate(datestr) {
    var date = new Date(Date.parse(datestr.replace(/-/g, "/")));
    return date;
}

//正则替换
String.prototype.regexpString = function (oldstrinng, newstring) {
    var reg = new RegExp("\\" + oldstrinng, "g");
    return this.replace(reg, newstring);
}

String.prototype.trim = function () {
    return this.replace(/(^\s*)|(\s*$)/g, "");
}

Date.prototype.pattern = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份         
        "d+": this.getDate(), //日         
        "h+": this.getHours() % 12 == 0 ? 12 : this.getHours() % 12, //小时         
        "H+": this.getHours(), //小时         
        "m+": this.getMinutes(), //分         
        "s+": this.getSeconds(), //秒         
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度         
        "S": this.getMilliseconds() //毫秒         
    };
    var week = {
        "0": "\u65e5",
        "1": "\u4e00",
        "2": "\u4e8c",
        "3": "\u4e09",
        "4": "\u56db",
        "5": "\u4e94",
        "6": "\u516d"
    };
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    if (/(E+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, ((RegExp.$1.length > 1) ? (RegExp.$1.length > 2 ? "\u661f\u671f" : "\u5468") : "") + week[this.getDay() + ""]);
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        }
    }
    return fmt;
}

$.ajaxSetup({
    error: function (request, error) {
        var sessionStatus = request.getResponseHeader("SESSION_STATUS");
        if (sessionStatus == "TIMEOUT") {
            var returnurl = window.top.location.pathname;
            if (webRoot != "") returnurl = returnurl.replace(webRoot, "");
            window.top.location.href = webRoot + "/login?returnurl=" + encodeURIComponent(returnurl);
        } else {
            $.error(arguments[0].responseText);
        }
    }
});

//比冒泡法好的排序方法，性能循环次数减少一半
Array.prototype.sorting = function (filed, desc) {
    var loopCount = 0;
    var data = this;
    var end_i = data.length - 1;
    var start_i = 0;

    if (data.length == 0) return;

    do {
        var t1 = t2 = start_i;
        for (var i = start_i + 1; i <= end_i; i++) {
            if (filed != undefined) {
                if (!desc) {
                    if (data[t1][filed] > data[i][filed]) t1 = i;
                    if (data[t2][filed] < data[i][filed]) t2 = i;
                }
                else {
                    if (data[t1][filed] < data[i][filed]) t1 = i;
                    if (data[t2][filed] > data[i][filed]) t2 = i;
                }
            } else {
                if (!desc) {
                    if (data[t1] > data[i]) t1 = i;
                    if (data[t2] < data[i]) t2 = i;
                }
                else {
                    if (data[t1] < data[i]) t1 = i;
                    if (data[t2] > data[i]) t2 = i;
                }
            }
        }

        if (t2 == start_i)  t2 = t1;

        var p = data[start_i];
        data[start_i] = data[t1];
        data[t1] = p;

        p = data[end_i];
        data[end_i] = data[t2];
        data[t2] = p;
    } while (++start_i < --end_i);

}

/**
 * 地图名称映射方法
 * @param data
 * @param filed 地市名称字段
 */
function mapNameConvert(data, filed) {
    if (data == undefined)
        return null;

    for (var i = 0; i < data.length; i++) {
        var refname = mapNames[data[i][filed]];
        if (refname != undefined) {
            data[i][filed] = refname;
        }
    }
    return data;
}

/**
 * 乘以100
 * @param val
 * @returns {string}
 */
function multiply100(val) {
    if (val == undefined || val == "-") return "-";
    return String((Number(val) * 100).toFixed(2)).regexpString(".0{2,}", "");
}

/**
 * 速率单位转换 传入值是kbps
 * @param val
 * @returns {string}
 */
function rateConvert(val) {
    if (val == undefined || val == "-") return "- Kbps";
    val = Number(val);
    if (val > 1024 * 1024)
        return String((val / 1024 / 1024).toFixed(2)).regexpString(".0{2,}", "") + 'Gb/s';
    if (val > 1024)
        return String((val / 1024).toFixed(2)).regexpString(".0{2,}", "") + 'Mb/s';

    return String(val.toFixed(2)).regexpString(".0{2,}", "") + "Kbps";
}

/**
 * 时长转换  默认是毫秒
 * @param val
 */
function timeConvert(val) {
    if (val == undefined || val == "-") return "- ms";
    val = Number(val);
    if (val >= 1000 * 60 * 60)
        return String((val / 1000 / 60 / 60).toFixed(2)).regexpString(".0{2,}", "") + 'h';
    if (val >= 1000 * 60)
        return String((val / 1000 / 60).toFixed(2)).regexpString(".0{2,}", "") + 'min';
    if (val >= 1000)
        return String((val / 1000).toFixed(2)).regexpString(".0{2,}", "") + 's';

    return String(val).regexpString(".0{2,}", "") + "ms";
}

/**
 * 单位转换方法  num:需要处理的数字;isflow(是否是流量数字):true 流量,fasle 纯数字;
 * @param num
 * @param isflow
 * @param unit 默认是KB (传入单位):0 数字,1 bit ,2 Byte, 3 Kb, 4 KB,5 MB,6 GB,7TB;str 单位后缀
 * @returns {*}
 */
function unitConvert(num, isflow, unit) {
    if (num == null || num == "null" || typeof(num) == "undefined" || num == "-" || String(num) == "") {
        return '-';
    }

    var ret = unitConvert2(num, isflow, unit);
    return ret["value"] + ret["unit"];
}

function unitConvert2(num, isflow, unit) {
    if (num == null || num == "null" || typeof(num) == "undefined" || num == "-" || String(num) == "") {
        return {value: '', unit: ''};
    }
    var number = Number(num);
    if (isflow) {
        if (unit == undefined)
            unit = 4;
        if (unit == 1 && number / 8 < 1024) {
            return {value: String(number.toFixed(2)).regexpString(".0{2,}", ""), unit: 'B'};
        } else if (unit == 2 && number < 1024) {
            return {value: String(number.toFixed(2)).regexpString(".0{2,}", ""), unit: 'B'};
        } else if (unit == 3 && number < 8) {
            return {value: String(number.toFixed(2)).regexpString(".0{2,}", ""), unit: 'Kb'};
        }
        //把流量统一成KB
        switch (unit) {
            case 1:
                number = number / (8 * 1024);
                break;
            case 2:
                number = number / 1024;
                break;
            case 3:
                number = (number / 8);
                break;
            case 5:
                number = number * 1024;
                break;
            case 6:
                number = number * 1024 * 1024;
                break;
            case 7:
                number = number * 1024 * 1024 * 1024;
                break;
        }
        if (number > 1024 * 1024 * 1024 * 1024)
            return {
                value: String((number / 1024 / 1024 / 1024 / 1024).toFixed(2)).regexpString(".0{2,}", ""),
                unit: 'PB'
            };
        else if (number > 1024 * 1024 * 1024) {
            return {value: String((number / 1024 / 1024 / 1024).toFixed(2)).regexpString(".0{2,}", ""), unit: 'TB'};
        } else if (number > 1024 * 1024) {
            return {value: String((number / 1024 / 1024).toFixed(2)).regexpString(".0{2,}", ""), unit: 'GB'};
        } else if (number > 1024) {
            return {value: String((number / 1024).toFixed(2)).regexpString(".0{2,}", ""), unit: 'MB'};
        } else {
            return {value: String(number.toFixed(2)).regexpString(".0{2,}", ""), unit: 'KB'};
        }
    } else {
        if (num > 100000000)
            return {value: String((number / 100000000).toFixed(2)).regexpString(".0{2,}", ""), unit: '亿'};
        if (num > 10000)
            return {value: String((number / 10000).toFixed(2)).regexpString(".0{2,}", ""), unit: '万'};
        else
            return {value: String((number).toFixed(2)).regexpString(".0{2,}", ""), unit: ''};
    }
}


newGuid = function () {

    var g = "";

    var i = 32;

    while (i--) {

        g += Math.floor(Math.random() * 16.0).toString(16);

    }

    return g;
}

//滚动图片构造函数
function ScrollPic(scrollContId, arrLeftId, arrRightId, dotListId, listType) {
    this.scrollContId = scrollContId;
    this.arrLeftId = arrLeftId;
    this.arrRightId = arrRightId;
    this.dotListId = dotListId;
    this.listType = listType;
    this.dotClassName = "dotItem";
    this.dotOnClassName = "dotItemOn";
    this.dotObjArr = [];
    this.listEvent = "onclick";
    this.circularly = true;
    this.pageWidth = 0;
    this.frameWidth = 0;
    this.speed = 10;
    this.space = 10;
    this.upright = false;
    this.pageIndex = 0;
    this.autoPlay = true;
    this.autoPlayTime = 5;
    this._autoTimeObj;
    this._scrollTimeObj;
    this._state = "ready";
    this.stripDiv = document.createElement("DIV");
    this.lDiv01 = document.createElement("DIV");
    this.lDiv02 = document.createElement("DIV")
};ScrollPic.prototype = {
    version: "1.44",
    author: "mengjia",
    pageLength: 0,
    touch: true,
    scrollLeft: 0,
    eof: false,
    bof: true,
    initialize: function () {
        var thisTemp = this;
        if (!this.scrollContId) {
            throw new Error("必须指定scrollContId.");
            return
        }
        ;
        this.scDiv = this.$(this.scrollContId);
        if (!this.scDiv) {
            throw new Error("scrollContId不是正确的对象.(scrollContId = \"" + this.scrollContId + "\")");
            return
        }
        ;
        this.scDiv.style[this.upright ? 'height' : 'width'] = this.frameWidth + "px";
        this.scDiv.style.overflow = "hidden";
        this.lDiv01.innerHTML = this.scDiv.innerHTML;
        this.scDiv.innerHTML = "";
        this.scDiv.appendChild(this.stripDiv);
        this.stripDiv.appendChild(this.lDiv01);
        if (this.circularly) {
            this.stripDiv.appendChild(this.lDiv02);
            this.lDiv02.innerHTML = this.lDiv01.innerHTML;
            this.bof = false;
            this.eof = false
        }
        ;
        this.stripDiv.style.overflow = "hidden";
        this.stripDiv.style.zoom = "1";
        this.stripDiv.style[this.upright ? 'height' : 'width'] = "32766px";
        this.lDiv01.style.overflow = "hidden";
        this.lDiv01.style.zoom = "1";
        this.lDiv02.style.overflow = "hidden";
        this.lDiv02.style.zoom = "1";
        if (!this.upright) {
            this.lDiv01.style.cssFloat = "left";
            this.lDiv01.style.styleFloat = "left"
        }
        ;
        this.lDiv01.style.zoom = "1";
        if (this.circularly && !this.upright) {
            this.lDiv02.style.cssFloat = "left";
            this.lDiv02.style.styleFloat = "left"
        }
        ;
        this.lDiv02.style.zoom = "1";
        this.addEvent(this.scDiv, "mouseover", function () {
            thisTemp.stop()
        });
        this.addEvent(this.scDiv, "mouseout", function () {
            thisTemp.play()
        });
        if (this.arrLeftId) {
            this.alObj = this.$(this.arrLeftId);
            if (this.alObj) {
                this.addEvent(this.alObj, "mousedown", function (e) {
                    thisTemp.rightMouseDown();
                    e = e || event;
                    thisTemp.preventDefault(e)
                });
                this.addEvent(this.alObj, "mouseup", function () {
                    thisTemp.rightEnd()
                });
                this.addEvent(this.alObj, "mouseout", function () {
                    thisTemp.rightEnd()
                })
            }
        }
        ;
        if (this.arrRightId) {
            this.arObj = this.$(this.arrRightId);
            if (this.arObj) {
                this.addEvent(this.arObj, "mousedown", function (e) {
                    thisTemp.leftMouseDown();
                    e = e || event;
                    thisTemp.preventDefault(e)
                });
                this.addEvent(this.arObj, "mouseup", function () {
                    thisTemp.leftEnd()
                });
                this.addEvent(this.arObj, "mouseout", function () {
                    thisTemp.leftEnd()
                })
            }
        }
        ;
        var pages = Math.ceil(this.lDiv01[this.upright ? 'offsetHeight' : 'offsetWidth'] / this.frameWidth), i, tempObj;
        this.pageLength = pages;
        if (this.dotListId) {
            this.dotListObj = this.$(this.dotListId);
            this.dotListObj.innerHTML = "";
            if (this.dotListObj) {
                for (i = 0; i < pages; i++) {
                    tempObj = document.createElement("span");
                    this.dotListObj.appendChild(tempObj);
                    this.dotObjArr.push(tempObj);
                    if (i == this.pageIndex) {
                        tempObj.className = this.dotOnClassName
                    } else {
                        tempObj.className = this.dotClassName
                    }
                    ;
                    if (this.listType == 'number') {
                        tempObj.innerHTML = i + 1
                    } else if (typeof(this.listType) == 'string') {
                        tempObj.innerHTML = this.listType
                    } else {
                        tempObj.innerHTML = ''
                    }
                    ;
                    tempObj.title = "第" + (i + 1) + "页";
                    tempObj.num = i;
                    tempObj[this.listEvent] = function () {
                        thisTemp.pageTo(this.num)
                    }
                }
            }
        }
        ;
        this.scDiv[this.upright ? 'scrollTop' : 'scrollLeft'] = 0;
        if (this.autoPlay) {
            this.play()
        }
        ;
        this._scroll = this.upright ? 'scrollTop' : 'scrollLeft';
        this._sWidth = this.upright ? 'scrollHeight' : 'scrollWidth';
        if (typeof(this.onpagechange) === 'function') {
            this.onpagechange()
        }
        ;
        this.iPad()
    },
    leftMouseDown: function () {
        if (this._state != "ready") {
            return
        }
        ;
        var thisTemp = this;
        this._state = "floating";
        clearInterval(this._scrollTimeObj);
        this._scrollTimeObj = setInterval(function () {
            thisTemp.moveLeft()
        }, this.speed);
        this.moveLeft()
    },
    rightMouseDown: function () {
        if (this._state != "ready") {
            return
        }
        ;
        var thisTemp = this;
        this._state = "floating";
        clearInterval(this._scrollTimeObj);
        this._scrollTimeObj = setInterval(function () {
            thisTemp.moveRight()
        }, this.speed);
        this.moveRight()
    },
    moveLeft: function () {
        if (this._state != "floating") {
            return
        }
        ;
        if (this.circularly) {
            if (this.scDiv[this._scroll] + this.space >= this.lDiv01[this._sWidth]) {
                this.scDiv[this._scroll] = this.scDiv[this._scroll] + this.space - this.lDiv01[this._sWidth]
            } else {
                this.scDiv[this._scroll] += this.space
            }
        } else {
            if (this.scDiv[this._scroll] + this.space >= this.lDiv01[this._sWidth] - this.frameWidth) {
                this.scDiv[this._scroll] = this.lDiv01[this._sWidth] - this.frameWidth;
                this.leftEnd()
            } else {
                this.scDiv[this._scroll] += this.space
            }
        }
        ;
        this.accountPageIndex()
    },
    moveRight: function () {
        if (this._state != "floating") {
            return
        }
        ;
        if (this.circularly) {
            if (this.scDiv[this._scroll] - this.space <= 0) {
                this.scDiv[this._scroll] = this.lDiv01[this._sWidth] + this.scDiv[this._scroll] - this.space
            } else {
                this.scDiv[this._scroll] -= this.space
            }
        } else {
            if (this.scDiv[this._scroll] - this.space <= 0) {
                this.scDiv[this._scroll] = 0;
                this.rightEnd()
            } else {
                this.scDiv[this._scroll] -= this.space
            }
        }
        ;
        this.accountPageIndex()
    },
    leftEnd: function () {
        if (this._state != "floating" && this._state != 'touch') {
            return
        }
        ;
        this._state = "stoping";
        clearInterval(this._scrollTimeObj);
        var fill = this.pageWidth - this.scDiv[this._scroll] % this.pageWidth;
        this.move(fill)
    },
    rightEnd: function () {
        if (this._state != "floating" && this._state != 'touch') {
            return
        }
        ;
        this._state = "stoping";
        clearInterval(this._scrollTimeObj);
        var fill = -this.scDiv[this._scroll] % this.pageWidth;
        this.move(fill)
    },
    move: function (num, quick) {
        var thisTemp = this;
        var thisMove = num / 5;
        var theEnd = false;
        if (!quick) {
            if (thisMove > this.space) {
                thisMove = this.space
            }
            ;
            if (thisMove < -this.space) {
                thisMove = -this.space
            }
        }
        ;
        if (Math.abs(thisMove) < 1 && thisMove != 0) {
            thisMove = thisMove >= 0 ? 1 : -1
        } else {
            thisMove = Math.round(thisMove)
        }
        ;
        var temp = this.scDiv[this._scroll] + thisMove;
        if (thisMove > 0) {
            if (this.circularly) {
                if (this.scDiv[this._scroll] + thisMove >= this.lDiv01[this._sWidth]) {
                    this.scDiv[this._scroll] = this.scDiv[this._scroll] + thisMove - this.lDiv01[this._sWidth]
                } else {
                    this.scDiv[this._scroll] += thisMove
                }
            } else {
                if (this.scDiv[this._scroll] + thisMove >= this.lDiv01[this._sWidth] - this.frameWidth) {
                    this.scDiv[this._scroll] = this.lDiv01[this._sWidth] - this.frameWidth;
                    this._state = "ready";
                    theEnd = true
                } else {
                    this.scDiv[this._scroll] += thisMove
                }
            }
        } else {
            if (this.circularly) {
                if (this.scDiv[this._scroll] + thisMove < 0) {
                    this.scDiv[this._scroll] = this.lDiv01[this._sWidth] + this.scDiv[this._scroll] + thisMove
                } else {
                    this.scDiv[this._scroll] += thisMove
                }
            } else {
                if (this.scDiv[this._scroll] + thisMove <= 0) {
                    this.scDiv[this._scroll] = 0;
                    this._state = "ready";
                    theEnd = true
                } else {
                    this.scDiv[this._scroll] += thisMove
                }
            }
        }
        ;
        if (theEnd) {
            this.accountPageIndex();
            return
        }
        ;
        num -= thisMove;
        if (Math.abs(num) == 0) {
            this._state = "ready";
            if (this.autoPlay) {
                this.play()
            }
            ;
            this.accountPageIndex();
            return
        } else {
            clearTimeout(this._scrollTimeObj);
            this._scrollTimeObj = setTimeout(function () {
                thisTemp.move(num, quick)
            }, this.speed)
        }
    },
    pre: function () {
        if (this._state != "ready") {
            return
        }
        ;
        this._state = "stoping";
        this.move(-this.pageWidth)
    },
    next: function (reStar) {
        if (this._state != "ready") {
            return
        }
        ;
        this._state = "stoping";
        if (this.circularly) {
            this.move(this.pageWidth)
        } else {
            if (this.scDiv[this._scroll] >= this.lDiv01[this._sWidth] - this.frameWidth) {
                this._state = "ready";
                if (reStar) {
                    this.pageTo(0)
                }
            } else {
                this.move(this.pageWidth)
            }
        }
    },
    play: function () {
        var thisTemp = this;
        if (!this.autoPlay) {
            return
        }
        ;
        clearInterval(this._autoTimeObj);
        this._autoTimeObj = setInterval(function () {
            thisTemp.next(true)
        }, this.autoPlayTime * 1000)
    },
    stop: function () {
        clearInterval(this._autoTimeObj)
    },
    pageTo: function (num) {
        if (this.pageIndex == num) {
            return
        }
        ;
        if (num < 0) {
            num = this.pageLength - 1
        }
        ;
        clearTimeout(this._scrollTimeObj);
        clearInterval(this._scrollTimeObj);
        this._state = "stoping";
        var fill = num * this.frameWidth - this.scDiv[this._scroll];
        this.move(fill, true)
    },
    accountPageIndex: function () {
        var pageIndex = Math.round(this.scDiv[this._scroll] / this.frameWidth);
        if (pageIndex >= this.pageLength) {
            pageIndex = 0
        }
        ;
        this.scrollLeft = this.scDiv[this._scroll];
        var scrollMax = this.lDiv01[this._sWidth] - this.frameWidth;
        if (!this.circularly) {
            this.eof = this.scrollLeft >= scrollMax;
            this.bof = this.scrollLeft <= 0
        }
        ;
        if (typeof(this.onmove) === 'function') {
            this.onmove()
        }
        ;
        if (pageIndex == this.pageIndex) {
            return
        }
        ;
        this.pageIndex = pageIndex;
        if (this.pageIndex > Math.floor(this.lDiv01[this.upright ? 'offsetHeight' : 'offsetWidth'] / this.frameWidth)) {
            this.pageIndex = 0
        }
        ;
        var i;
        for (i = 0; i < this.dotObjArr.length; i++) {
            if (i == this.pageIndex) {
                this.dotObjArr[i].className = this.dotOnClassName
            } else {
                this.dotObjArr[i].className = this.dotClassName
            }
        }
        ;
        if (typeof(this.onpagechange) === 'function') {
            this.onpagechange()
        }
    },
    iPadX: 0,
    iPadLastX: 0,
    iPadStatus: 'ok',
    iPad: function () {
        if (typeof(window.ontouchstart) === 'undefined') {
            return
        }
        ;
        if (!this.touch) {
            return
        }
        ;
        var tempThis = this;
        this.addEvent(this.scDiv, 'touchstart', function (e) {
            tempThis._touchstart(e)
        });
        this.addEvent(this.scDiv, 'touchmove', function (e) {
            tempThis._touchmove(e)
        });
        this.addEvent(this.scDiv, 'touchend', function (e) {
            tempThis._touchend(e)
        })
    },
    _touchstart: function (e) {
        this.stop();
        this.iPadX = e.touches[0].pageX;
        this.iPadScrollX = window.pageXOffset;
        this.iPadScrollY = window.pageYOffset;
        this.scDivScrollLeft = this.scDiv[this._scroll]
    },
    _touchmove: function (e) {
        if (e.touches.length > 1) {
            this._touchend()
        }
        ;
        this.iPadLastX = e.touches[0].pageX;
        var cX = this.iPadX - this.iPadLastX;
        if (this.iPadStatus == 'ok') {
            if (this.iPadScrollY == window.pageYOffset && this.iPadScrollX == window.pageXOffset && Math.abs(cX) > 20) {
                this.iPadStatus = 'touch'
            } else {
                return
            }
        }
        ;
        this._state = 'touch';
        var scrollNum = this.scDivScrollLeft + cX;
        if (scrollNum >= this.lDiv01[this._sWidth]) {
            if (this.circularly) {
                scrollNum = scrollNum - this.lDiv01[this._sWidth]
            } else {
                return
            }
        }
        ;
        if (scrollNum < 0) {
            if (this.circularly) {
                scrollNum = scrollNum + this.lDiv01[this._sWidth]
            } else {
                return
            }
        }
        ;
        this.scDiv[this._scroll] = scrollNum;
        e.preventDefault()
    },
    _touchend: function (e) {
        if (this.iPadStatus != 'touch') {
            return
        }
        ;
        this.iPadStatus = 'ok';
        var cX = this.iPadX - this.iPadLastX;
        if (cX < 0) {
            this.rightEnd()
        } else {
            this.leftEnd()
        }
        ;
        this.play()
    },
    _overTouch: function () {
        this.iPadStatus = 'ok'
    },
    $: function (objName) {
        if (document.getElementById) {
            return eval('document.getElementById("' + objName + '")')
        } else {
            return eval('document.all.' + objName)
        }
    },
    isIE: navigator.appVersion.indexOf("MSIE") != -1 ? true : false,
    addEvent: function (obj, eventType, func) {
        if (obj.attachEvent) {
            obj.attachEvent("on" + eventType, func)
        } else {
            obj.addEventListener(eventType, func, false)
        }
    },
    delEvent: function (obj, eventType, func) {
        if (obj.detachEvent) {
            obj.detachEvent("on" + eventType, func)
        } else {
            obj.removeEventListener(eventType, func, false)
        }
    },
    preventDefault: function (e) {
        if (e.preventDefault) {
            e.preventDefault()
        } else {
            e.returnValue = false
        }
    }
};


/**********************************模型里的Tab切换样式***************************************/



function changeRow_color(obj) {
    if (document.getElementById(obj) != null) {
        var Ptr = document.getElementById(obj).getElementsByTagName("tr");

        for (var i = 1; i < Ptr.length + 1; i++) {
            if (i % 2 > 0) {
                Ptr[i - 1].className = "t2";
            }
            else {
                Ptr[i - 1].className = "t1";
            }
        }


    }
}
function showInfo(event, id, className1, className2) {
    var classname1 = (className1 ? className1 : "special_color");
    var classname2 = (className2 ? className2 : "special_color3");
    if (event.target) {
        $(event.target).addClass(classname1);
        $(event.target).siblings().removeClass(classname1);
        $(event.target).siblings().addClass(classname2);
        if (id && id != "") {
            $("#" + id).css("display", "");
            $("#" + id).siblings().css("display", "none");
        }
    } else if (event.srcElement) {
        $(event.srcElement).addClass(classname1);
        $(event.srcElement).siblings().removeClass(classname1);
        $(event.srcElement).siblings().addClass(classname2);
        if (id && id != "") {
            $("#" + id).css("display", "");
            $("#" + id).siblings().css("display", "none");
        }
    }
}

function showInfo1(event, className1, id1) {
    var ev = event || window.event;
    var target = ev.target || ev.srcElement;
    if (target) {
        $(target).addClass(className1);
        $(target).siblings().removeClass(className1);
        $("#" + id1).show();
        $("#" + id1).siblings().hide();
    }
}

function showInfo2(event, className1, id1) {
    var ev = event || window.event;
    var target = ev.target || ev.srcElement;
    if (target) {
        $(target).addClass(className1);
        $(target).parent().siblings().find("a").removeClass(className1);
        $("#" + id1).show();
        $("#" + id1).siblings().hide();
    }
}

function showInfo3(obj, className1, id1) {
    $(obj).addClass(className1);
    $(obj).siblings().removeClass(className1);
    $("#" + id1).show();
    $("#" + id1).siblings().hide();
}

function changediv(id_num, id, n) {
    for (var i = 1; i <= n; i++) {
        var divName = document.getElementById("div1_" + id_num + i);
        var divObj = document.getElementById("div" + id_num + i);

        if (i == id) {
            divName.className = 'div_show';
            divObj.style.display = '';
        } else {
            divName.className = ' div_hidden';
            divObj.style.display = 'none';
        }
    }
}
function changeli(id_num, id, n) {
    for (var i = 1; i <= n; i++) {
        var divName = document.getElementById("li1_" + id_num + i);

        if (i == id) {
            divName.className = 'li_show';
        } else {
            divName.className = ' li_hidden';
        }
    }
}

function changemap(id_num, id, n) {
    for (var i = 1; i <= n; i++) {
        var divName = document.getElementById("map1_" + id_num + i);
        var divObj = document.getElementById("map" + id_num + i);

        if (i == id) {
            divName.className = 'map_show';
            divObj.style.display = '';
        } else {
            divName.className = ' map_hidden';
            divObj.style.display = 'none';
        }
    }
}

//date common
function getSysDay() {
    return getDayPre(2);
}
//eg getDayPre(2)
function getDayPre(daynum) {
    var date = new Date();
    date.setDate(date.getDate() - daynum);
    return date;
}

function getDayPreNum(daynum) {
    var date = new Date();
    date.setDate(date.getDate() - daynum);
    return date.pattern("yyyyMMdd");
}

function cpObj(param) {
    return JSON.parse(JSON.stringify(param));
}

