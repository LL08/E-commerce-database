USE [E-commerceDB]
GO
/****** Object:  Table [dbo].[admin]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admin](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[adminName] [nvarchar](10) NOT NULL,
	[adminPassword] [nvarchar](15) NOT NULL,
	[adminType] [smallint] NOT NULL,
	[adminPower] [int] NULL,
	[isEnable] [smallint] NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[announcement]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[announcement](
	[announcementID] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NULL,
	[content] [ntext] NULL,
	[postTime] [datetime] NULL,
	[isPost] [smallint] NULL,
 CONSTRAINT [PK_announcement] PRIMARY KEY CLUSTERED 
(
	[announcementID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[answer]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[answer](
	[questionID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[answerContent] [nvarchar](1000) NOT NULL,
	[answerTime] [datetime] NOT NULL,
	[thumbUpNum] [int] NULL,
	[answerID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_answer] PRIMARY KEY CLUSTERED 
(
	[answerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ask_question]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ask_question](
	[questionID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
	[questionContent] [nvarchar](100) NOT NULL,
	[creatTime] [datetime] NOT NULL,
	[communityID] [int] NOT NULL,
	[tagID] [int] NULL,
	[attentionNum] [int] NULL,
 CONSTRAINT [PK_ask_question] PRIMARY KEY CLUSTERED 
(
	[questionID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[card]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[card](
	[cardID] [int] IDENTITY(1,1) NOT NULL,
	[createTime] [datetime] NOT NULL,
	[sellerShopID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[type] [smallint] NOT NULL,
	[validTime] [int] NULL,
 CONSTRAINT [PK_card] PRIMARY KEY CLUSTERED 
(
	[cardID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[cart_item]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cart_item](
	[cartID] [int] NOT NULL,
	[goodsID] [int] NOT NULL,
	[count] [int] NOT NULL,
	[isValid] [smallint] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[category]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[category](
	[goodsCategoryID] [int] IDENTITY(1,1) NOT NULL,
	[categoryName] [nvarchar](50) NOT NULL,
	[parentID] [int] NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[goodsCategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[comment]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[comment](
	[commentID] [int] IDENTITY(1,1) NOT NULL,
	[goodsNumber] [nvarchar](50) NOT NULL,
	[userID] [int] NOT NULL,
	[goodsComment] [ntext] NOT NULL,
	[commentImg] [nvarchar](50) NULL,
	[star] [int] NULL,
	[tagID] [nvarchar](50) NULL,
	[isAppend] [smallint] NOT NULL,
	[isDefault] [smallint] NULL,
 CONSTRAINT [PK_Comment] PRIMARY KEY CLUSTERED 
(
	[commentID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[community]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[community](
	[communityID] [int] IDENTITY(1,1) NOT NULL,
	[goodsID] [int] NOT NULL,
	[questionNum] [int] NOT NULL,
	[communityIntro] [nvarchar](100) NULL,
	[tagNum] [int] NULL,
	[tagID] [nvarchar](100) NULL,
 CONSTRAINT [PK_Community] PRIMARY KEY CLUSTERED 
(
	[communityID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[coupon]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[coupon](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[couponID] [int] NOT NULL,
	[couponName] [nvarchar](50) NOT NULL,
	[sellerShopID] [int] NOT NULL,
	[creatTime] [datetime] NOT NULL,
	[isUsable] [smallint] NULL,
	[validTime] [int] NOT NULL,
	[isGot] [smallint] NOT NULL,
	[isUsed] [smallint] NOT NULL,
	[couponType] [smallint] NULL,
 CONSTRAINT [PK_Coupon] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[family]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[family](
	[familyID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
	[name] [nvarchar](50) NOT NULL,
	[createTime] [datetime] NOT NULL,
	[point] [int] NOT NULL,
 CONSTRAINT [PK_family] PRIMARY KEY CLUSTERED 
(
	[familyID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[family_member]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[family_member](
	[familyID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[joinTime] [datetime] NOT NULL,
	[role] [nvarchar](10) NULL,
	[memberName] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[goods]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[goods](
	[goodsID] [int] IDENTITY(1,1) NOT NULL,
	[goodsNumber] [nvarchar](50) NOT NULL,
	[goodsName] [nvarchar](50) NOT NULL,
	[goodsCategoryID] [int] NULL,
	[costPrice] [smallmoney] NOT NULL,
	[sellPrice] [smallmoney] NOT NULL,
	[goodsImg] [nvarchar](50) NULL,
	[goodsWeigth] [float] NULL,
	[goodsIntro] [ntext] NULL,
	[goodsStore] [int] NULL,
	[clickNum] [int] NULL,
	[isPost] [smallint] NULL,
	[tagID] [int] NULL,
	[manufacturer] [nvarchar](50) NULL,
	[shopID] [int] NOT NULL,
 CONSTRAINT [PK_Goods] PRIMARY KEY CLUSTERED 
(
	[goodsID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[goods_coupon]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[goods_coupon](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[goodsNumber] [nvarchar](50) NOT NULL,
	[couponID] [int] NOT NULL,
 CONSTRAINT [PK_Goods_Coupon] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[got_coupon]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[got_coupon](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[couponID] [int] NOT NULL,
	[userID] [int] NOT NULL,
 CONSTRAINT [PK_GotCoupon] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[orderID] [int] NOT NULL,
	[creatTime] [datetime] NOT NULL,
	[sellerShopID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[state] [int] NOT NULL,
	[actualPay] [smallmoney] NULL,
	[modeOfPay] [smallint] NULL,
	[discount] [smallmoney] NULL,
	[deliveryID] [int] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order_detail]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order_detail](
	[orderDetailID] [int] IDENTITY(1,1) NOT NULL,
	[orderID] [int] NOT NULL,
	[goodsNumber] [nvarchar](50) NOT NULL,
	[count] [int] NOT NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[orderDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[package]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[package](
	[packageID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
 CONSTRAINT [PK_package] PRIMARY KEY CLUSTERED 
(
	[packageID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[sec_kill]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sec_kill](
	[SeckillID] [int] IDENTITY(1,1) NOT NULL,
	[creatTime] [datetime] NOT NULL,
	[goodsNumber] [nvarchar](50) NOT NULL,
	[lastedTime] [int] NOT NULL,
	[limitedNumber] [int] NULL,
	[seckillPrice] [smallmoney] NOT NULL,
	[intro] [nvarchar](1000) NULL,
 CONSTRAINT [PK_Seckill] PRIMARY KEY CLUSTERED 
(
	[SeckillID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shop]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shop](
	[sellerShopID] [int] IDENTITY(1,1) NOT NULL,
	[CreateTime] [datetime] NOT NULL,
	[shopName] [nvarchar](50) NOT NULL,
	[shopImg] [nvarchar](50) NULL,
	[shopOwnerName] [nvarchar](50) NOT NULL,
	[shopIntro] [nvarchar](100) NULL,
	[fansNumber] [int] NULL,
	[shopType] [int] NULL,
 CONSTRAINT [PK_shop] PRIMARY KEY CLUSTERED 
(
	[sellerShopID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shop_member]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shop_member](
	[sellerShopID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[memberType] [smallint] NULL,
	[joinTime] [datetime] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[shopping_cart]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[shopping_cart](
	[cartID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
 CONSTRAINT [PK_shopping_cart] PRIMARY KEY CLUSTERED 
(
	[cartID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tag]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tag](
	[tagID] [int] IDENTITY(1,1) NOT NULL,
	[tagContent] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Tag] PRIMARY KEY CLUSTERED 
(
	[tagID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[take_delivery]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[take_delivery](
	[deliveryID] [int] IDENTITY(1,1) NOT NULL,
	[userID] [int] NOT NULL,
	[receiverName] [nvarchar](50) NOT NULL,
	[address] [nvarchar](200) NOT NULL,
	[province] [nvarchar](50) NOT NULL,
	[city] [nvarchar](50) NOT NULL,
	[county] [nvarchar](50) NOT NULL,
	[cellPhone] [char](11) NOT NULL,
	[addressType] [nvarchar](100) NULL,
 CONSTRAINT [PK_TakeDelivery] PRIMARY KEY CLUSTERED 
(
	[deliveryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[user]    Script Date: 2019/12/27 星期五 17:30:16 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[user](
	[userID] [int] IDENTITY(1,1) NOT NULL,
	[nickName] [nvarchar](50) NULL,
	[memberName] [nvarchar](50) NOT NULL,
	[userName] [nvarchar](50) NOT NULL,
	[sex] [nvarchar](10) NULL,
	[birth] [datetime] NULL,
	[email] [nvarchar](20) NULL,
	[cellPhone] [char](11) NULL,
	[password] [nvarchar](15) NOT NULL,
	[userType] [int] NOT NULL,
	[deliveryID] [int] NULL,
	[creatTime] [datetime] NOT NULL,
	[rank] [smallint] NOT NULL,
 CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[cart_item] ADD  CONSTRAINT [DF_cart_item_isValid]  DEFAULT ((0)) FOR [isValid]
GO
ALTER TABLE [dbo].[comment] ADD  CONSTRAINT [DF_comment_isAppend]  DEFAULT ((0)) FOR [isAppend]
GO
ALTER TABLE [dbo].[goods]  WITH CHECK ADD  CONSTRAINT [FK_goods_category] FOREIGN KEY([goodsCategoryID])
REFERENCES [dbo].[category] ([goodsCategoryID])
GO
ALTER TABLE [dbo].[goods] CHECK CONSTRAINT [FK_goods_category]
GO
