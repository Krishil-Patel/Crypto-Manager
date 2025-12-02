import { useEffect, useState } from "react";
import ReactApexChart from "react-apexcharts";
import fetchData, { dataType } from "../Home/fetchMarketData";
import { convertToUnixTimestamp } from "./ConvertToChartData";

const Chart = () => {
  const [stockData, setStockData] = useState(null);

  useEffect(() => {
    const fetchStockData = async () => {
      const data = await fetchData();
      console.log("stock data ", data[dataType]);
      const chartData=convertToUnixTimestamp(data[dataType])
      console.log("chartData ",chartData)
      setStockData(data);
    };
    fetchStockData();
  }, []);

  if (!stockData) {
    return <div>Loading...</div>;
  }

  const dates = Object.keys(stockData[dataType]);
  const closePrices = dates.map((date) =>
    parseFloat(stockData[dataType][date]["4. close"])
  );

  const options = {
    chart: {
      type: "area",
      stacked: false,
      height: 350,
      zoom: {
        enabled: true,
      },
    },
    dataLabels: {
      enabled: false,
    },
    xaxis: {
      type: "datetime",
      categories: dates,
      title: {
      },
      pan: {
        enabled: true,
      },
    },
    yaxis: {
      title: {
      },
    },
    title: {
      text: "IBM Stock Weekly Closing Prices",
      align: "center",
    },
    colors: ["#fff"],
    markers: {
      colors: ["#fff"],
      strokeColors: "#fff",
      strokeWidth: 2,
    },
    tooltip: {
      theme: "dark",
    },
    toolbar: {
      show: true,
    },
    grid: {
      borderColor: "#cccccc",
      strokeDashArray: 4,
      show: true,
    },
    series: [{
        name: 'Series 1',
        data: closePrices,
        fill: {
            type: 'solid',
            color: '#3367d6',
            opacity: 0.5
        }
    }]
  };

  const series = [
    {
      name: "Close Prices",
      data: closePrices,
    },
  ];

  return (
    <div className="stock-chart">
      <ReactApexChart
        options={options}
        series={series}
        type="line"
        height={640}
      />
    </div>
  );
};

export default Chart;
